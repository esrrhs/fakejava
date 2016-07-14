package test;

import fakescript.*;

public class test
{
	public static void main(String[] args)
	{
		System.out.println("hehe");
		
		fake f = fk.newfake(null);
		fk.set_callback(f, new callbackimpl());
		
		boolean ret = fk.parse(f, "./bin/test.fk");
	}
}