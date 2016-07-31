package fakescript;

import java.util.ArrayList;

class processor
{
	private fake m_f;
	private routine m_entryroutine;
	private int m_genid;
	private routine m_curroutine;
	private ArrayList<routine> m_routines = new ArrayList<routine>();
	
	public processor(fake f)
	{
		m_f = f;
	}
	
	public routine get_curroutine()
	{
		return m_curroutine;
	}
	
	public routine start_routine(variant func, ArrayList<Integer> retpos)
			throws Exception
	{
		routine r = new routine(m_f);
		
		if (m_entryroutine == null)
		{
			m_entryroutine = r;
		}
		
		r.set_id(m_genid);
		m_genid++;
		r.set_processor(this);
		r.entry(func, retpos);
		
		if (m_curroutine == null)
		{
			m_curroutine = r;
		}
		
		m_routines.add(r);
		
		return r;
	}
	
	public void run() throws Exception
	{
		while (!m_routines.isEmpty())
		{
			for (int i = 0; i < (int) m_routines.size(); i++)
			{
				routine r = m_routines.get(i);
				m_curroutine = r;
				// 注意:此函数内部可能会调用到add接口
				r.run(m_f.cfg.per_frame_cmd_num);
				if (r.is_end())
				{
					m_routines.remove(i);
				}
			}
		}
	}
	
	public String get_routine_info()
	{
		String tmp = "";
		for (int i = 0; i < m_routines.size(); i++)
		{
			routine r = m_routines.get(i);
			
			tmp += "#";
			tmp += i;
			tmp += "\tId:";
			tmp += r.get_id();
			tmp += "\t";
			tmp += r.get_interpreter().get_running_func_name();
			tmp += "(";
			tmp += r.get_interpreter().get_running_file_name();
			tmp += ":";
			tmp += r.get_interpreter().get_running_file_line();
			tmp += ")\t";
			tmp += r.is_end() ? "Dead" : "Alive";
			tmp += "\n";
		}
		return tmp;
	}
	
}
