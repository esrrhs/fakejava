package fakescript;

import java.util.ArrayList;

class parser 
{
	private fake m_f;
	private int m_parse_dep = 0;
	private ArrayList<String> m_parsing_file_list = new ArrayList<String>();
	
	public parser(fake f)
	{
		m_f = f;
	}
	
	public void clear()
	{
		m_parse_dep = 0;
	}
	
	public boolean parse(String filename)
	{
		m_parse_dep++;
		
		// 检查深度
		if (m_parse_dep >= m_f.cfg.include_deps)
		{
			types.seterror(m_f, filename, 0, "", "parse " + filename + " file too deep " + m_parse_dep);
			return false;
		}

		// 检查当前文件是否在解析中
		if (is_parsing(filename))
		{
			types.seterror(m_f, filename, 0, "", "already parsing " + filename + " file...include list \n" + get_parsing_file_list());
			return false;
		}

		// 加入
		m_parsing_file_list.add(filename);

		// TODO 输入源文件

		return true;
	}
	
	private boolean is_parsing(String filename)
	{
		boolean ret = false;
		for (int i = 0; i < (int)m_parsing_file_list.size(); i++)
		{
			if (m_parsing_file_list.get(i) == filename)
			{
				return true;
			}
		}
		return ret;
	}
	
	private String get_parsing_file_list()
	{
		String ret = "";
		for (int i = 0; i < (int)m_parsing_file_list.size(); i++)
		{
			ret += m_parsing_file_list.get(i);
			ret += "\n";
		}
		return ret;
	}
}
