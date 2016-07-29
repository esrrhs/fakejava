package fakescript;

public class fake
{
	protected String errorstr = "";
	protected callback cb = null;

	// 配置
	protected fkconfig cfg = new fkconfig();

	// 解析
	protected parser pa = new parser(this);

	// 参数栈
	protected paramstack ps = new paramstack(this);

	// 二进制
	protected binary bin = new binary(this);

	// 函数索引
	protected funcmap fm = new funcmap(this);
}
