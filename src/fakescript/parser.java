package fakescript;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
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

		// 输入源文件
		String content = read_file(filename);
		if (content.isEmpty())
		{
			return false;
		}
		
		java.io.Reader reader = new java.io.StringReader(content);
		cup yyp = new cup();
		yyp.setScanner(new jflex(reader));
		try 
		{
			yyp.parse();
		}
		catch (Exception e) 
		{
			types.seterror(m_f, filename, 0, "", "parse " + filename + " fail " + e.toString());
			return false;
	    }
		
		return true;
	}

	private String read_file(String filename)
	{
		File file = new File(filename);
		if (!file.isFile() || !file.exists())
		{
			types.seterror(m_f, filename, 0, "", "open " + filename + " fail");
			return "";
		}
		
		try 
		{
			String ret = "";
			String encoding = "utf-8";
			
			Reader reader = new InputStreamReader(new FileInputStream(file), encoding);
			BufferedReader bufferedReader = new BufferedReader(reader);
            char[] readbuff = new char[10];
            while(bufferedReader.read(readbuff) != -1)
            {
            	ret += String.valueOf(readbuff);
            }
            reader.close();
	        
			return ret;
	    } 
		catch (Exception e) 
		{
			types.seterror(m_f, filename, 0, "", "read " + filename + " fail " + e.toString());
			return "";
	    }
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
