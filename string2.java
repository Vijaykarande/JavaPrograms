class string2
{
	public static void main(String [] args)
	{
		String s1="MOM12";
		String s2="";
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			s2 = s1.charAt(i)+s2;
		}
		if(s1.equals(s2))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		System.out.println(s1);
		System.out.println(s2);
	}
	
}

		