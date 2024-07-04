class bloodmf
{
	public static void main(String [] args)
	{
		char gender='M';
		int age=12;
		int weight=45;
		if(gender =='M')
		{
			if(age >=18 && weight>=65)
			{
				System.out.println("Eligible for blood donation");
			}
			else
			{
				System.out.println("Not eligible");
			}
		}
		else if( gender=='F')
		{
			if(age >=18 && weight>=55)
			{
				System.out.println("Eligible for donation");
			}
			else
			{
				System.out.println("Not eligible");
			}
		}
		else
		{
			System.out.println("not eligible");
		}
	}
}
class while10