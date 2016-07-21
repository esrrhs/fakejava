package fakescript;

class types 
{
	public static void seterror(fake f, String file, int lineno, String func, String errorstr)
	{
		f.errorstr = errorstr;
		
		if (f.cb != null)
		{
			f.cb.on_error(f, file, lineno, func, errorstr);
		}
	}
	
	public static void log(String str, Object... args)
	{
		System.out.printf(str, args);
		System.out.println("");
	}
	
	public static String show_exception(Exception e)
	{
		String ret = "";
		for (StackTraceElement se : e.getStackTrace()) 
		{
			ret += se.toString() + "\n";
        }
		ret += e.toString();
		return ret;
	}

	public static String gen_package_name(String p, String n)
	{
		if (p.isEmpty())
		{
			return n;
		}
		else
		{
			return p + "." + n;
		}
	}

	public static boolean isint(double d)
	{
		long l = (long)d;
		return l == d;
	}
	
	public static String stringeletoa(stringele ele)
	{
		return ele.toString();
	}
	
	public static String uitoa(long uid)
	{
		return "" + uid;
	}
	
	public static String pointertoa(Object o)
	{
		if (o == null)
		{
			return "";
		}
		return o.toString();
	}
	
	public static String arraytoa(variant_array va)
	{
		// TODO
		return "";
	}
	
	public static String maptoa(variant_map va)
	{
		// TODO
		return "";
	}
}
