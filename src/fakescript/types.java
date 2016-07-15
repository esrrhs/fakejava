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
	
	public static void log(String str)
	{
		System.out.println(str);
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
}
