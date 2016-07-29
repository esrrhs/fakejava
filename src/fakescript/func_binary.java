package fakescript;

class func_binary
{
	// 最大栈空间
	public int m_maxstack;
	// 参数个数
	public int m_paramnum;
	// 名字
	public String m_name;
	// 文件名
	public String m_filename;
	// 包名
	public String m_packagename;
	// 二进制缓冲区
	public long[] m_buff;
	// 二进制行号缓冲区
	public int[] m_lineno_buff;
	public int m_end_lineno;
	// 常量
	public variant[] m_const_list;
	// container地址
	public container_addr[] m_container_addr_list;
	// 调试信息，栈变量
	public stack_variant_info[] m_debug_stack_variant_info;
	// 序列
	public int m_pos;
	// 占用标记
	public int m_use;
	// 备份
	public func_binary m_backup;
	// 新标记
	public int m_fresh;
	
	public String dump()
	{
		String ret = "";

		// 名字
		ret += "\n[";
		ret += m_name;
		ret += "]\n";

		// 最大栈
		ret += "\tmaxstack:\t";
		ret += m_maxstack;
		ret += "\n\n";
		
		// 常量表
		ret += "\t////// const define ";
		ret += m_const_list.length;
		ret += " //////\n";
		for (int i = 0; i < (int)m_const_list.length; i++)
		{  
			ret += "\t[";
			ret += i;
			ret += "]\t";
			ret += m_const_list[i].m_type;
			ret += "\t";
			ret += m_const_list[i].toString();
			ret += "\n";
		}
		
		// 容器地址表
		ret += "\n\t////// container addr ";
		ret += m_container_addr_list.length;
		ret += " //////\n";
		for (int i = 0; i < (int)m_container_addr_list.length; i++)
		{  
			ret += "\t[";
			ret += i;
			ret += "]\t";
			long concmd = m_container_addr_list[i].m_con;
			int concode = command.COMMAND_CODE(concmd);
			ret += "[ CONTAINER ]\t";
			ret += types.dump_addr(concode);
			long keycmd = m_container_addr_list[i].m_key;
			int keycode = command.COMMAND_CODE(keycmd);
			ret += "\t[ KEY ]\t";
			ret += types.dump_addr(keycode);
			ret += "\n";
		}

		// 变量地址
		ret += "\n\t////// stack variant addr ";
		ret += m_debug_stack_variant_info.length;
		ret += " //////\n";
		for (int i = 0; i < (int)m_debug_stack_variant_info.length; i++)
		{  
			stack_variant_info info = m_debug_stack_variant_info[i];
			ret += "\t[";
			ret += info.m_pos;
			ret += "]\t";
			ret += info.m_name;
			ret += "\t\tLINE\t";
			ret += info.m_line;
			ret += "\n";
		}
		
		ret += "\n\t////// byte code ";
		ret += m_buff.length;
		ret += " //////\n";
		// 字节码
		for (int i = 0; i < (int)m_buff.length; i++)
		{	
			long cmd = m_buff[i];
			int type = command.COMMAND_TYPE(cmd);
			int code = command.COMMAND_CODE(cmd);
			ret += "\t[";
			ret += i;
			ret += "]";
			ret += "[LINE ";
			ret += get_binary_lineno(i);
			ret += "]\t";
			ret += String.format("0x%016x", cmd);
			ret += "\t";
			switch (type)
			{
			case command.COMMAND_OPCODE:
				{
					ret += "[";
					ret += types.OpCodeStr(code);
					ret += "]\t";
				}
				break;
			case command.COMMAND_ADDR:
				{
					ret += "[ ADDR ]\t";
					ret += types.dump_addr(code);
				}
				break;
			case command.COMMAND_POS:
				{
					ret += "[ POS  ]\t";
					ret += code;
				}
				break;
			default:
				{
					ret += "[unknow]\t";
				}
				break;
			}
			ret += "\n";
		}
		ret += "\n";
		return ret;
	}
	
	private int get_binary_lineno(int pos)
	{
		return (pos >= 0 && pos < (int)m_lineno_buff.length) ? m_lineno_buff[pos] : (m_lineno_buff.length > 0 ? m_end_lineno : 0);
	}
}
