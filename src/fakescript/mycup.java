package fakescript;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import fakescript.syntree.func_desc_node;
import fakescript.syntree.syntree_node;

public class mycup
{
	private String m_packagename = "";
	private ArrayList<String> m_includelist = new ArrayList<String>();
	private HashSet<String> m_struct_list = new HashSet<String>();
	private HashMap<String, syntree_node> m_constmap = new HashMap<String, syntree_node>();
	private ArrayList<func_desc_node> m_funclist = new ArrayList<func_desc_node>();
	private jflex m_f;

	public mycup(jflex f)
	{
		m_f = f;
	}

	public jflex get_jflex()
	{
		return m_f;
	}

	public String get_package()
	{
		return m_packagename;
	}

	public void set_package(String packagename)
	{
		m_packagename = packagename;
	}

	public void add_include(String includefile)
	{
		// 加入include list，等待解析完再统一挨个include
		m_includelist.add(includefile);
	}

	public void add_struct_desc(String structname)
	{
		m_struct_list.add(structname);
	}

	boolean is_have_struct(String structname)
	{
		return m_struct_list.contains(structname);
	}

	public HashMap<String, syntree_node> get_const_map()
	{
		return m_constmap;
	}

	public void add_const_desc(String name, syntree_node node)
	{
		m_constmap.put(name, node);
		types.log("add_const_desc " + name + " " + node.dump(0));
	}

	public void add_func_desc(func_desc_node p)
	{
		types.log("add_func_desc " + p.m_funcname);
		types.log("func " + p.m_funcname + " dump " + p.dump(0));
		m_funclist.add(p);
	}

	public ArrayList<func_desc_node> get_func_list()
	{
		return m_funclist;
	}
}
