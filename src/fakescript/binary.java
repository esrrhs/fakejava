package fakescript;

class binary
{
	private fake m_f;

	public binary(fake f)
	{
		m_f = f;
	}

	public String dump()
	{
		return "";
	}

	public void add_func(variant name, func_binary bin)
	{
		funcunion f = m_f.fm.get_func(name);
		if (f != null && f.m_havefb && f.m_fb.m_use != 0)
		{
			types.log("[binary] add_func func %s add back bin", name);
			f.m_fb = bin;
		}
		else
		{
			types.log("[binary] add_func func %s add bin", name);
			m_f.fm.add_func(name, bin);
		}

		types.log("add func %s", name);
	}
}
