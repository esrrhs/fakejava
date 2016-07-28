package fakescript;

import java.util.ArrayList;

class codegen
{
	class block_identifiers
	{
		public String m_name;
		public int m_pos;

		public block_identifiers(String m_name, int m_pos)
		{
			this.m_name = m_name;
			this.m_pos = m_pos;
		}
	}

	private fake m_f;
	private ArrayList<ArrayList<block_identifiers>> m_block_identifiers_stack = new ArrayList<ArrayList<block_identifiers>>();
	private ArrayList<stack_variant_info> m_debug_block_identifiers_list = new ArrayList<stack_variant_info>();
	private int m_stackpos;
	private int m_maxstackpos;
	private ArrayList<Long> m_byte_code_list = new ArrayList<Long>();
	private ArrayList<Integer> m_byte_lineno_list = new ArrayList<Integer>();

	public codegen(fake f)
	{
		m_f = f;
	}

	public void push_stack_identifiers()
	{
		m_block_identifiers_stack.add(new ArrayList<block_identifiers>());
	}

	public void pop_stack_identifiers()
	{
		ArrayList<block_identifiers> list = m_block_identifiers_stack.get(m_block_identifiers_stack.size() - 1);
		int stacksize = list.size();
		m_block_identifiers_stack.remove(m_block_identifiers_stack.size() - 1);
		m_stackpos -= stacksize;
	}

	public int add_stack_identifier(String name, int line)
	{
		if (get_cur_variable_pos(name) != -1)
		{
			return -1;
		}
		ArrayList<block_identifiers> list = m_block_identifiers_stack.get(m_block_identifiers_stack.size() - 1);
		list.add(new block_identifiers(name, m_stackpos));
		int ret = m_stackpos;
		m_stackpos++;
		if (m_stackpos > m_maxstackpos)
		{
			m_maxstackpos = m_stackpos;
		}

		stack_variant_info tmp = new stack_variant_info();
		tmp.m_name = name;
		tmp.m_line = line;
		tmp.m_pos = ret;
		m_debug_block_identifiers_list.add(tmp);

		return ret;
	}

	public int get_cur_variable_pos(String name)
	{
		ArrayList<block_identifiers> list = m_block_identifiers_stack.get(m_block_identifiers_stack.size() - 1);
		for (int i = 0; i < (int) list.size(); i++)
		{
			if (name == list.get(i).m_name)
			{
				return list.get(i).m_pos;
			}
		}
		return -1;
	}

	public int byte_code_size()
	{
		return m_byte_code_list.size();
	}

	public void push(long code, int lineno)
	{
		m_byte_code_list.add(code);
		m_byte_lineno_list.add(lineno);
	}

	void set(int pos, long code)
	{
		m_byte_code_list.set(pos, code);
	}
}
