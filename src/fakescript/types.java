package fakescript;

import java.util.Iterator;
import java.util.Map.Entry;

class types
{
	public static void seterror(fake f, String file, int lineno, String func, String errorstr, Object... args)
	{
		f.errorstr = String.format(errorstr, args);

		if (f.cb != null)
		{
			f.cb.on_error(f, file, lineno, func, f.errorstr);
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
		long l = (long) d;
		return l == d;
	}

	public static String pointertoa(Object o)
	{
		if (o == null)
		{
			return "";
		}
		return o.toString();
	}

	public static String arraytoa(Object o)
	{
		variant_array va = (variant_array) o;
		if (va.m_recur != 0)
		{
			return "ARRAY IN RECUR";
		}
		va.m_recur++;

		String ret = "";
		ret += "[";

		for (int i = 0; i < va.m_va.size(); i++)
		{
			variant n = va.m_va.get(i);
			if (n != null)
			{
				ret += n.toString();
			}
			else
			{
				ret += " ";
			}
			ret += ",";
		}

		ret += "]";

		va.m_recur--;

		return ret;
	}

	public static String maptoa(Object o)
	{
		variant_map vm = (variant_map) o;
		if (vm.m_recur != 0)
		{
			return "MAP IN RECUR";
		}
		vm.m_recur++;

		String ret = "";
		ret += "{";
		int i = 0;
		Iterator<Entry<variant, variant>> it = vm.m_vm.entrySet().iterator();
		while (it.hasNext())
		{
			Entry<variant, variant> entry = it.next();
			variant kv = (variant) entry.getKey();
			variant vv = (variant) entry.getValue();
			if (i == 0)
			{
				ret += "(";
			}
			else
			{
				ret += ",(";
			}

			ret += kv.toString();
			ret += ",";
			ret += vv.toString();
			ret += ")";

			i++;
		}

		vm.m_recur--;

		return ret;
	}
}
