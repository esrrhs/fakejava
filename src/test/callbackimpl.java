package test;

import fakescript.*;

public class callbackimpl implements callback
{
	public void on_error(fake f, String file, int lineno, String func, String str)
	{
		System.out.printf("fake error in file(%s:%d) func(%s) : ", file, lineno, func);
		System.out.printf("%s\n", str);
		// TODO
		//System.out.printf("call stack :\n%s\n", fk.getcurcallstack(f));
		//System.out.printf("cur routine :\n%s\n", fk.getcurroutine(f));
	}
}
