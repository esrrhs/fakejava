package fakescript;

class routine
{
	private fake m_f;
	private int m_id;
	private finterpreter m_interpreter;
	
	public routine(fake f)
	{
		m_f = f;
		m_interpreter = new finterpreter(f);
	}
	
	public variant get_ret()
	{
		return m_interpreter.get_ret();
	}
	
	public void set_id(int id)
	{
		m_id = id;
	}
	
	public int get_id()
	{
		return m_id;
	}
	
	public void set_processor(processor pro)
	{
		m_interpreter.set_processor(pro);
	}
	
	public void entry(variant func)
	{
		m_interpreter.call(func);
	}
	
	public void run(int cmdnum)
	{
		m_interpreter.run(cmdnum);
	}
	
	public boolean is_end()
	{
		return m_interpreter.is_end();
	}
}
