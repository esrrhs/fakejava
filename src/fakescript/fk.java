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
		f.pa.parse(filename);
		return true;
	}

}