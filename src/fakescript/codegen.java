package fakescript;

import java.util.ArrayList;

class codegen
{
	class block_identifiers
	{
		public String m_name;
		public int m_pos;
	}

	private fake m_f;

	private ArrayList<ArrayList<block_identifiers>> m_block_identifiers_stack = new ArrayList<ArrayList<block_identifiers>>();

	public codegen(fake f)
	{
		m_f = f;
	}

	public void push_stack_identifiers()
	{
		m_block_identifiers_stack.add(new ArrayList<block_identifiers>());
	}
}
