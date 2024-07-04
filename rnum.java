class rnum
{
	public static void main(String [] args)
	{
		int no=123456;
		System.out.println("Number before reverse:"+no);
		
		System.out.println("Number after reverse:");
		while(no>0)
		{
			int last=no%10;
			System.out.print(last);
			no=no/10;
			
			
		}
	}
}
