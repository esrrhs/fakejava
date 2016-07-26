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
}
