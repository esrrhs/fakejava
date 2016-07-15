package fakescript;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import fakescript.syntree.syntree_node;

public class mycup
{
	private String m_packagename = "";	
	private ArrayList<String> m_includelist = new ArrayList<String>();
	private HashSet<String> m_struct_list = new HashSet<String>();
	private HashMap<String, syntree_node> m_constmap = new HashMap<String, syntree_node>();
	
	public mycup()
	{
		
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
	
	public void add_const_desc(String name, syntree_node node)
	{
		m_constmap.put(name, node);
		types.log("add_const_desc " + name + " " + node.dump(0));
	}
}
