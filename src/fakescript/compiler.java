package fakescript;

import java.util.HashMap;
import java.util.Iterator;

import fakescript.syntree.*;

class compiler 
{
	fake m_f;
	mycup m_mcp;
	
	public compiler(fake f, mycup mcp)
	{
		m_f = f;
		m_mcp = mcp;
	}
	
	public boolean compile()
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
	
	public boolean compile_const_head()
	{
		types.log("[compiler] compile_const_head");
		
		// 注册全局常量表
		HashMap<String, syntree_node> evm = m_mcp.get_const_map();
		Iterator it = evm.entrySet().iterator();
		while (it.hasNext())
		{   
			HashMap.Entry entry = (HashMap.Entry)it.next();
			String name = (String)entry.getKey();
			explicit_value_node ev = (explicit_value_node)entry.getValue();
			
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

		return true;
	}
	
	public variant compile_explicit_value_node_to_variant(explicit_value_node ev)
	{
		return null;
	}
}
