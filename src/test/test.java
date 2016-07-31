package test;

import fakescript.callback;
import fakescript.fake;
import fakescript.fk;

public class test
{
	public static void main(String[] args)
	{
		fake f = fk.newfake(null);
		fk.reg(f, "test");
		fk.set_callback(f, new callback()
		{
			@Override
			public void on_error(fake f, String file, int lineno, String func,
					String str)
			{
				System.out.printf("fake error in file(%s:%d) func(%s) : ", file,
						lineno, func);
				System.out.printf("%s\n", str);
				System.out.printf("call stack :\n%s\n", fk.getcurcallstack(f));
				System.out.printf("cur routine :\n%s\n", fk.getcurroutine(f));
			}
		});
		
		boolean b = fk.parse(f, "./src/test/test.fk");
		if (!b)
		{
			System.out.println("parse fail");
		}
		
		int ret = (Integer) fk.run(f, "main", 1);
		System.out.println("run ret " + ret);
	}
}