package test;

import fakescript.callback;
import fakescript.fake;
import fakescript.fk;

public class test
{
	public static void main(String[] args)
	{
		fake f = fk.newfake(null);
		fk.set_callback(f, new callback() {
			@Override
			public void on_error(fake f, String file, int lineno, String func, String str)
			{
				System.out.printf("fake error in file(%s:%d) func(%s) : ", file, lineno, func);
				System.out.printf("%s\n", str);
				// TODO
				//System.out.printf("call stack :\n%s\n", fk.getcurcallstack(f));
				//System.out.printf("cur routine :\n%s\n", fk.getcurroutine(f));
			}
		});

		boolean ret = fk.parse(f, "./src/test/test.fk");
		if (!ret)
		{
			System.out.println("parse fail");
		}
		System.out.println("hehe");
	}
}