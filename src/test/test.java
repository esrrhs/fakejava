package test;

import fakescript.*;

public class test
{
	public static void main(String[] args)
	{
		fake f = fk.newfake(null);
		fk.set_callback(f, new callbackimpl());
		
		boolean ret = fk.parse(f, "./src/test/test.fk");
		System.out.println("hehe");
	}
}