package fakescript;

import java.util.ArrayList;

class running
{
	fake m_f;
	ArrayList<processor> m_processes = new ArrayList<processor>();
	
	public running(fake f)
	{
		m_f = f;
	}
	
	public processor cur_pro()
	{
		return m_processes.isEmpty() ? null
				: m_processes.get(m_processes.size() - 1);
	}
	
	public void push_pro(processor pro)
	{
		m_processes.add(pro);
	}
	
	public void pop_pro()
	{
		m_processes.remove(m_processes.size() - 1);
	}
}
