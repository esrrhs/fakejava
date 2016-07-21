package fakescript;

import java.math.BigInteger;

class variant 
{
	// type
	variant_type m_type;
	
	// data
	public double m_real;
	public stringele m_str;
	public Object m_ponter;
	public long m_uuid;
	public variant_array m_va;
	public variant_map m_vm;
	
	public variant()
	{
		
	}
	
	public String toString()
	{
		String ss = "";
		if (this.m_type == variant_type.REAL)
		{
			if (types.isint(this.m_real))
			{
				ss = "" + (long)this.m_real;
			}
			else
			{
				ss = "" + (this.m_real);
			}
		}
		else if (this.m_type == variant_type.STRING)
		{
			ss = types.stringeletoa(this.m_str);
		}
		else if (this.m_type == variant_type.UUID)
		{
			ss = types.uitoa(this.m_uuid);
		}
		else if (this.m_type == variant_type.POINTER)
		{
			ss = types.pointertoa(this.m_ponter);
		}
		else if (this.m_type == variant_type.ARRAY)
		{
			ss = types.arraytoa(this.m_va);
		}
		else if (this.m_type == variant_type.MAP)
		{
			ss = types.maptoa(this.m_vm);
		}
		else if (this.m_type == variant_type.NIL)
		{
			ss = "nil";
		}
		else
		{
			ss = "ERROR";
		}	
		return ss;
	}
	
}
