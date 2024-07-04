class sumofeo
{
	public static void main(String [] args)
	{
		int no=1;
		int esum=0;
		int osum=0;
		while(no<=10)
		{
			if(no%2==0)
			{
				System.out.println("Even:");
				esum=esum+no;
			}
			else
			{
				System.out.println("Odd:");
				osum=osum+no;
			}
			no++;
		}
		System.out.println("evensum:"+esum);
		System.out.println("oddsum:"+osum);
	}
}

				
