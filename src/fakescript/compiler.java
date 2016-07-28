package fakescript;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import fakescript.syntree.assign_stmt;
import fakescript.syntree.block_node;
import fakescript.syntree.break_stmt;
import fakescript.syntree.cmp_stmt;
import fakescript.syntree.const_array_list_value_node;
import fakescript.syntree.const_map_list_value_node;
import fakescript.syntree.const_map_value_node;
import fakescript.syntree.container_get_node;
import fakescript.syntree.continue_stmt;
import fakescript.syntree.esyntreetype;
import fakescript.syntree.explicit_value_node;
import fakescript.syntree.for_loop_stmt;
import fakescript.syntree.for_stmt;
import fakescript.syntree.func_desc_node;
import fakescript.syntree.function_call_node;
import fakescript.syntree.if_stmt;
import fakescript.syntree.math_assign_stmt;
import fakescript.syntree.math_expr_node;
import fakescript.syntree.multi_assign_stmt;
import fakescript.syntree.return_stmt;
import fakescript.syntree.return_value_list_node;
import fakescript.syntree.sleep_stmt;
import fakescript.syntree.struct_pointer_node;
import fakescript.syntree.switch_stmt;
import fakescript.syntree.syntree_node;
import fakescript.syntree.var_node;
import fakescript.syntree.variable_node;
import fakescript.syntree.while_stmt;
import fakescript.syntree.yield_stmt;

class compiler
{
	private fake m_f;
	private mycup m_mcp;
	private String m_cur_compile_func;
	private ArrayList<ArrayList<Integer>> m_loop_break_pos_stack = new ArrayList<ArrayList<Integer>>();
	private ArrayList<Integer> m_loop_continue_pos_stack = new ArrayList<Integer>();
	private boolean m_cmp_jne;
	private long m_cur_addr;
	private ArrayList<Long> m_cur_addrs = new ArrayList<Long>();
	private int m_cmp_deps;

	public compiler(fake f, mycup mcp)
	{
		m_f = f;
		m_mcp = mcp;
	}

	public boolean compile() throws Exception
	{
		if (!compile_const_head())
		{
			return false;
		}

		if (!compile_body())
		{
			return false;
		}

		return true;
	}

	public boolean compile_const_head() throws Exception
	{
		types.log("[compiler] compile_const_head");

		// 注册全局常量表
		HashMap<String, syntree_node> evm = m_mcp.get_const_map();
		Iterator<Entry<String, syntree_node>> it = evm.entrySet().iterator();
		while (it.hasNext())
		{
			Entry<String, syntree_node> entry = it.next();
			String name = (String) entry.getKey();
			explicit_value_node ev = (explicit_value_node) entry.getValue();

			variant v = compile_explicit_value_node_to_variant(ev);
			if (v == null)
			{
				types.log("[compiler] compile_explicit_value_node_to_variant %s fail", name);
				return false;
			}

			String constname = types.gen_package_name(m_mcp.get_package(), name);

			m_f.pa.reg_const_define(constname, v, ev.lineno());

			types.log("[compiler] reg_const_define %s %s", constname, v);

		}
		return true;
	}

	public boolean compile_body()
	{
		for (func_desc_node funcnode : m_mcp.get_func_list())
		{
			if (!compile_func(funcnode))
			{
				types.log("[compiler] compile_body %s fail", funcnode.m_funcname);
				return false;
			}
		}

		return true;
	}

	public void compile_seterror(syntree_node node, String formatstr, Object... args)
	{
		String str = String.format(formatstr, args);
		types.seterror(m_f, m_mcp.get_filename(), node.lineno(), m_cur_compile_func, str);
	}

	public boolean compile_func(func_desc_node funcnode)
	{
		m_cur_compile_func = funcnode.m_funcname;

		codegen cg = new codegen(m_f);
		func_binary bin = new func_binary();
		bin.m_end_lineno = funcnode.m_endline;

		// 压栈
		cg.push_stack_identifiers();

		// 参数入栈
		if (funcnode.m_arglist != null)
		{
			ArrayList<String> arglist = funcnode.m_arglist.m_arglist;
			for (int i = 0; i < (int) arglist.size(); i++)
			{
				String arg = arglist.get(i);
				if (cg.add_stack_identifier(arg, funcnode.m_arglist.lineno()) == -1)
				{
					compile_seterror(funcnode.m_arglist, "double %s identifier error", arg);
					return false;
				}
			}
			bin.m_paramnum = arglist.size();
		}

		// 编译函数体
		if (funcnode.m_block != null)
		{
			if (!compile_block(cg, funcnode.m_block))
			{
				return false;
			}
		}

		return true;
	}

	public boolean compile_block(codegen cg, block_node blocknode)
	{
		for (int i = 0; i < (int) blocknode.m_stmtlist.size(); i++)
		{
			syntree_node stmt = blocknode.m_stmtlist.get(i);
			if (!compile_node(cg, stmt))
			{
				return false;
			}
		}

		return true;
	}

	public boolean compile_node(codegen cg, syntree_node node)
	{
		esyntreetype type = node.gettype();
		switch (type)
		{
			case est_block:
			{
				block_node bn = (block_node) (node);
				if (!compile_block(cg, bn))
				{
					return false;
				}
				break;
			}
			case est_while_stmt:
			{
				while_stmt ws = (while_stmt) (node);
				if (!compile_while_stmt(cg, ws))
				{
					return false;
				}
				break;
			}
			case est_for_stmt:
			{
				for_stmt fs = (for_stmt) (node);
				if (!compile_for_stmt(cg, fs))
				{
					return false;
				}
				break;
			}
			case est_multi_assign_stmt:
			{
				multi_assign_stmt as = (multi_assign_stmt) (node);
				if (!compile_multi_assign_stmt(cg, as))
				{
					return false;
				}
				break;
			}
			case est_cmp_stmt:
			{
				cmp_stmt cs = (cmp_stmt) (node);
				if (!compile_cmp_stmt(cg, cs))
				{
					return false;
				}
				break;
			}
			case est_if_stmt:
			{
				if_stmt is = (if_stmt) (node);
				if (!compile_if_stmt(cg, is))
				{
					return false;
				}
				break;
			}
			case est_explicit_value:
			{
				explicit_value_node ev = (explicit_value_node) (node);
				if (!compile_explicit_value(cg, ev))
				{
					return false;
				}
				break;
			}
			case est_return_stmt:
			{
				return_stmt rs = (return_stmt) (node);
				if (!compile_return_stmt(cg, rs))
				{
					return false;
				}
				break;
			}
			case est_return_value_list:
			{
				return_value_list_node rn = (return_value_list_node) (node);
				if (!compile_return_value_list(cg, rn))
				{
					return false;
				}
				break;
			}
			case est_assign_stmt:
			{
				assign_stmt as = (assign_stmt) (node);
				if (!compile_assign_stmt(cg, as))
				{
					return false;
				}
				break;
			}
			case est_math_assign_stmt:
			{
				math_assign_stmt ms = (math_assign_stmt) (node);
				if (!compile_math_assign_stmt(cg, ms))
				{
					return false;
				}
				break;
			}
			case est_variable:
			{
				variable_node vn = (variable_node) (node);
				if (!compile_variable_node(cg, vn))
				{
					return false;
				}
				break;
			}
			case est_var:
			{
				var_node vn = (var_node) (node);
				if (!compile_var_node(cg, vn))
				{
					return false;
				}
				break;
			}
			case est_function_call:
			{
				function_call_node fn = (function_call_node) (node);
				if (!compile_function_call_node(cg, fn))
				{
					return false;
				}
				break;
			}
			case est_break:
			{
				break_stmt bs = (break_stmt) (node);
				if (!compile_break_stmt(cg, bs))
				{
					return false;
				}
				break;
			}
			case est_continue:
			{
				continue_stmt cs = (continue_stmt) (node);
				if (!compile_continue_stmt(cg, cs))
				{
					return false;
				}
				break;
			}
			case est_math_expr:
			{
				math_expr_node mn = (math_expr_node) (node);
				if (!compile_math_expr_node(cg, mn))
				{
					return false;
				}
				break;
			}
			case est_container_get:
			{
				container_get_node cn = (container_get_node) (node);
				if (!compile_container_get(cg, cn))
				{
					return false;
				}
				break;
			}
			case est_struct_pointer:
			{
				struct_pointer_node cn = (struct_pointer_node) (node);
				if (!compile_struct_pointer(cg, cn))
				{
					return false;
				}
				break;
			}
			case est_sleep:
			{
				sleep_stmt ss = (sleep_stmt) (node);
				if (!compile_sleep_stmt(cg, ss))
				{
					return false;
				}
				break;
			}
			case est_yield:
			{
				yield_stmt ys = (yield_stmt) (node);
				if (!compile_yield_stmt(cg, ys))
				{
					return false;
				}
				break;
			}
			case est_switch_stmt:
			{
				switch_stmt ss = (switch_stmt) (node);
				if (!compile_switch_stmt(cg, ss))
				{
					return false;
				}
				break;
			}
			case est_for_loop_stmt:
			{
				for_loop_stmt fs = (for_loop_stmt) (node);
				if (!compile_for_loop_stmt(cg, fs))
				{
					return false;
				}
				break;
			}
			default:
			{
				compile_seterror(node, "compile node type error %s", type.toString());
				return false;
			}
		}

		return true;
	}

	public variant compile_explicit_value_node_to_variant(explicit_value_node ev) throws Exception
	{
		variant v = new variant();
		switch (ev.m_type)
		{
			case EVT_TRUE:
				v.set_real(1);
				break;
			case EVT_FALSE:
				v.set_real(0);
				break;
			case EVT_NUM:
				v.set_real(Integer.valueOf(ev.m_str));
				break;
			case EVT_STR:
				v.set_string(ev.m_str);
				break;
			case EVT_FLOAT:
				v.set_real(Double.valueOf(ev.m_str));
				break;
			case EVT_UUID:
				v.set_uuid(Long.valueOf(ev.m_str.substring(0, ev.m_str.length() - 1)));
				break;
			case EVT_MAP:
			{
				const_map_list_value_node cml = (const_map_list_value_node) ev.m_v;
				variant_map vm = new variant_map();
				vm.m_isconst = true;

				for (int i = 0; i < cml.m_lists.size(); i++)
				{
					const_map_value_node cmv = (const_map_value_node) cml.m_lists.get(i);

					explicit_value_node kn = (explicit_value_node) cmv.m_k;
					explicit_value_node vn = (explicit_value_node) cmv.m_v;

					variant kv = compile_explicit_value_node_to_variant(kn);
					variant vv = compile_explicit_value_node_to_variant(vn);

					variant des = vm.con_map_get(kv);
					des.copy_from(vv);
				}

				v.set_map(vm);
			}
				break;
			case EVT_ARRAY:
			{
				const_array_list_value_node cal = (const_array_list_value_node) ev.m_v;
				variant_array va = new variant_array();
				va.m_isconst = true;
				for (int i = 0; i < cal.m_lists.size(); i++)
				{
					explicit_value_node vn = (explicit_value_node) cal.m_lists.get(i);
					variant kv = new variant();
					kv.set_real(i);

					variant vv = compile_explicit_value_node_to_variant(vn);

					variant des = va.con_array_get(kv);
					des.copy_from(vv);
				}

				v.set_array(va);
			}
				break;

			default:
				throw new Exception("compile explicit value type error " + ev.m_type.toString());
		}
		return v;
	}

	public boolean compile_while_stmt(codegen cg, while_stmt ws)
	{
		int startpos = 0;
		int jnepos = 0;

		m_loop_break_pos_stack.add(new ArrayList<Integer>());

		startpos = cg.byte_code_size();

		m_loop_continue_pos_stack.add(startpos);

		// 条件
		cg.push_stack_identifiers();
		if (!compile_node(cg, ws.m_cmp))
		{
			return false;
		}
		cg.pop_stack_identifiers();

		// cmp与jne结合
		if (m_cmp_jne)
		{
			cg.push(command.EMPTY_CMD, ws.m_cmp.lineno()); // 先塞个位置
			jnepos = cg.byte_code_size() - 1;
		}
		else
		{
			cg.push(command.MAKE_OPCODE(command.OPCODE_JNE), ws.lineno());
			cg.push(m_cur_addr, ws.lineno());
			cg.push(command.EMPTY_CMD, ws.lineno()); // 先塞个位置
			jnepos = cg.byte_code_size() - 1;
		}
		m_cmp_deps = 0;
		m_cmp_jne = false;

		// block块
		if (ws.m_block != null)
		{
			cg.push_stack_identifiers();
			if (!compile_node(cg, ws.m_block))
			{
				return false;
			}
			cg.pop_stack_identifiers();
		}

		// 跳回判断地方
		cg.push(command.MAKE_OPCODE(command.OPCODE_JMP), ws.lineno());
		cg.push(command.MAKE_POS(startpos), ws.lineno());

		// 跳转出block块
		cg.set(jnepos, command.MAKE_POS(cg.byte_code_size()));

		// 替换掉break
		ArrayList<Integer> bplist = m_loop_break_pos_stack.get(m_loop_break_pos_stack.size() - 1);
		for (int i = 0; i < (int) bplist.size(); i++)
		{
			cg.set(bplist.get(i), command.MAKE_POS(cg.byte_code_size()));
		}
		m_loop_break_pos_stack.remove(m_loop_break_pos_stack.size() - 1);

		m_loop_continue_pos_stack.remove(m_loop_continue_pos_stack.size() - 1);

		return true;
	}

	public boolean compile_for_stmt(codegen cg, for_stmt fs)
	{
		return true;
	}

	public boolean compile_if_stmt(codegen cg, if_stmt is)
	{
		return true;
	}

	public boolean compile_return_stmt(codegen cg, return_stmt rs)
	{
		return true;
	}

	public boolean compile_assign_stmt(codegen cg, assign_stmt as)
	{
		return true;
	}

	public boolean compile_multi_assign_stmt(codegen cg, multi_assign_stmt as)
	{
		return true;
	}

	public boolean compile_math_assign_stmt(codegen cg, math_assign_stmt ms)
	{
		return true;
	}

	public boolean compile_break_stmt(codegen cg, break_stmt bs)
	{
		return true;
	}

	public boolean compile_continue_stmt(codegen cg, continue_stmt cs)
	{
		return true;
	}

	public boolean compile_cmp_stmt(codegen cg, cmp_stmt cs)
	{
		return true;
	}

	public boolean compile_explicit_value(codegen cg, explicit_value_node ev)
	{
		return true;
	}

	public boolean compile_variable_node(codegen cg, variable_node vn)
	{
		return true;
	}

	public boolean compile_var_node(codegen cg, var_node vn)
	{
		return true;
	}

	public boolean compile_function_call_node(codegen cg, function_call_node fn)
	{
		return true;
	}

	public boolean compile_math_expr_node(codegen cg, math_expr_node mn)
	{
		return true;
	}

	public boolean compile_return_value_list(codegen cg, return_value_list_node rn)
	{
		return true;
	}

	public boolean compile_container_get(codegen cg, container_get_node cn)
	{
		return true;
	}

	public boolean compile_struct_pointer(codegen cg, struct_pointer_node sn)
	{
		return true;
	}

	public boolean compile_sleep_stmt(codegen cg, sleep_stmt ss)
	{
		return true;
	}

	public boolean compile_yield_stmt(codegen cg, yield_stmt ys)
	{
		return true;
	}

	public boolean compile_switch_stmt(codegen cg, switch_stmt ss)
	{
		return true;
	}

	public boolean compile_for_loop_stmt(codegen cg, for_loop_stmt ss)
	{
		return true;
	}
}
