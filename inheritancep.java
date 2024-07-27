class inheritancep
{
	class Addition
	{
		void add()
		{
			int x=10;
			int y=10;
			z=x+y;
			System.out.println(z);
		}
	}
	class Substaction extends Addition
	{
		void sub()
		{
			int a=20;
			int b=20;
			int c=a+b;
			System.out.println(c);
		}
	}
	public static void main(String [] args)
	{
		Substaction s1=new Substaction();
		System.out.println(s1.add());
		System.out.println(s1.sub());
	}
}
