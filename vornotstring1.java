class vornotstring1
{
	public static void main(String [] args)
	{
		String s1="VIJAYRAJARAMKARANDE";
		String s2=s1.toLowerCase();
		int count=0;
		
		char vowles []={'a','e','i','o','u'};
		
		for(int i=0;i<=s2.length()-1;i++)
		{
			for(int j=0;j<=vowles.length-1;j++)
			{
				if( s2.charAt(i) == vowles[j])
				{
					count++;
				}
				
			}
		
		}
		System.out.println("Count:"+count);
	}
}
