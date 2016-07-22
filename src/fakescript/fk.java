package fakescript;

public class fk
{
	public static fake newfake(fkconfig config)
	{
		fake f = new fake();
		if (config != null)
		{
			f.cfg = config;
		}
		return f;
	}
	
	public static void set_callback(fake f, callback cb)
	{
		f.cb = cb;
	}
	
	public static boolean parse(fake f, String filename)
	{
		f.pa.clear();
		return f.pa.parse(filename);
	}

	public static Object run(fake f, String func, Object... args)
	{
		psclear(f);
		for (Object arg : args)
		{
			pspush(f, arg);
		}
		runps(f, func);
		return pspop(f);
	}

	protected static void psclear(fake f)
	{
		
	}
	
	protected static void pspush(fake f, Object arg)
	{
		Class< ? extends Object> c = arg.getClass();
		if (c == Byte.class)
		{
			
		}
		else if (c == Short.class)
		{
			
		}
		else if (c == Integer.class)
		{
			
		}
		else if (c == Long.class)
		{
			
		}
		else if (c == Float.class)
		{
			
		}
		else if (c == Double.class)
		{
			
		}
		else if (c == Boolean.class)
		{
			
		}
		else
		{
			
		}
	}
	
	protected static Object pspop(fake f)
	{
		return null;
	}
	
	protected static void runps(fake f, String func)
	{
		
	}
}