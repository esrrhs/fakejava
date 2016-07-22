package fakescript;

import java.math.BigInteger;

class variant 
{
	// type
	public variant_type m_type;
	
	// data
	public Object m_data;
	
	public variant()
	{
		
	}
	
	public String toString()
	{
		String ss = "";
		if (this.m_type == variant_type.REAL)
		{
			double real = (double)m_data;
			if (types.isint(real))
			{
				ss = "" + (long)real;
			}
			else
			{
				ss = "" + real;
			}
		}
		else if (this.m_type == variant_type.STRING)
		{
			ss = (String)(this.m_data);
		}
		else if (this.m_type == variant_type.UUID)
		{
			ss = "" + (long)m_data;
		}
		else if (this.m_type == variant_type.POINTER)
		{
			ss = "" + m_data;
		}
		else if (this.m_type == variant_type.ARRAY)
		{
			ss = types.arraytoa(this.m_data);
		}
		else if (this.m_type == variant_type.MAP)
		{
			ss = types.maptoa(this.m_data);
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
