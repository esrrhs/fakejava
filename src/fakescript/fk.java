package fakescript;

import java.lang.reflect.Method;
import java.util.List;

import fakescript.bind.fakescript;
import fakescript.bind.packagehelper;

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
	
	public static void reg(fake f, String packagename)
	{
		List<Class<?>> tmp = packagehelper.getClasses(packagename);
		for (Class<?> c : tmp)
		{
			Method[] ms = c.getDeclaredMethods();
			for (Method m : ms)
			{
				if (m.isAnnotationPresent(fakescript.class))
				{
					fakescript fn = (fakescript) m
							.getAnnotation(fakescript.class);
					
					String name = fn.name();
					if (name.equals(""))
					{
						name = m.getName();
					}
					
					fkfunctor fkf = new fkfunctor();
					fkf.m_c = c;
					fkf.m_m = m;
					fkf.m_param = m.getParameterTypes();
					fkf.m_ret = m.getReturnType();
					
					variant v = new variant();
					v.set_string(name);
					
					f.fm.add_func(v, fkf);
					
					types.log("fk reg %s %s", name, fkf);
				}
			}
		}
		
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
	
	public static String getcurfile(fake f)
	{
		return "";
	}
	
	public static int getcurline(fake f)
	{
		return 0;
	}
	
	public static String getcurfunc(fake f)
	{
		return "";
	}
	
	public static String getcurcallstack(fake f)
	{
		return "";
	}
	
	public static String getcurroutine(fake f)
	{
		return "";
	}
	
	protected static void psclear(fake f)
	{
		
	}
	
	protected static void pspush(fake f, Object arg)
	{
		Class<? extends Object> c = arg.getClass();
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