class ola
{
	int pricerate=12;
}
class auto extends ola
{
	int pmrate=20;
}
class mini extends ola
{
	int pmrate=30;
}
class testdriver
{
	public static void main(String [] args)
	{
		ola o=new mini();
		{
			if(o instanceof mini)
			{
				mini m1=(mini) o;
				System.out.println("TOTAL BILL:"+(m1.pricerate+m1.pmrate));
			}
			else if(o instanceof auto)
			{
				auto a1=(auto) o;
				System.out.println("TOTAL BILL:"+(a1.pricerate+a1.pmrate));
			}
		}
	}
}

		