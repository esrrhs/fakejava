package fakescript;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import fakescript.syntree.const_array_list_value_node;
import fakescript.syntree.const_map_list_value_node;
import fakescript.syntree.const_map_value_node;
import fakescript.syntree.explicit_value_node;
import fakescript.syntree.func_desc_node;
import fakescript.syntree.syntree_node;

class compiler
{
	private fake m_f;
	private mycup m_mcp;
	private String m_cur_compile_func;

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

	public boolean compile_func(func_desc_node funcnode)
	{
		m_cur_compile_func = funcnode.m_funcname;

		codegen cg = new codegen(m_f);
		func_binary bin = new func_binary();
		bin.m_end_lineno = funcnode.m_endline;

		// 压栈
		cg.push_stack_identifiers();

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
}
