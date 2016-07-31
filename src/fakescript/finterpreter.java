package fakescript;

import java.util.ArrayList;

class finterpreter
{
	private fake m_f;
	private boolean m_isend;
	private ArrayList<variant> m_ret;
	processor m_processor;
	
	public finterpreter(fake f)
	{
		m_f = f;
	}
	
	public boolean is_end()
	{
		return m_isend;
	}
	
	public variant get_ret()
	{
		return m_ret.isEmpty() ? new variant() : m_ret.get(0);
	}
	
	public void set_processor(processor pro)
	{
		m_processor = pro;
	}
	
	public void call(variant func)
	{
		
	}
	
	public void run(int cmdnum)
	{
		
	}
}
