class NotVallidException extends Exception
{
	@Override
	public String toString()
	{
		return "Not Valid Exception";
	}
}

class customeexceeoption
{
	public static void main(String [] args)
	{
		String s1="Hello";
		
		if(s1.equals("hello"))
		{
			System.out.println("Suceess");
		}
		else
		{
			try
			{
				throw new NotVallidException();
			}
			catch(NotVallidException e)
			{
				System.out.println("NVE HANDELD");
				System.out.println(e.getMessage());
			}
		}
	}
}

		