package fakescript;

public class fkconfig 
{
	public int per_frame_cmd_num = 10;			// 每帧执行命令数目
	public int array_grow_speed = 50;			// 增长速度，百分比，10%代表增长10%
	public int string_heap_num = 1000;			// 字符串集合的最大数目
	public int pointer_heap_num = 1000;			// 指针集合的最大数目
	public int include_deps = 100;				// 解析include最大深度
	public int stack_max = 10000;				// stack最大尺寸
}
