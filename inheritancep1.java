
	class Addition
	{
		void add()
		{
			int x=10;
			int y=10;
			int z=x+y;
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
	
	class inheritancep1
	{
	public static void main(String [] args)
	{
		Substaction s1=new Substaction();
		s1.add();
		s1.sub();
	}
	
}
