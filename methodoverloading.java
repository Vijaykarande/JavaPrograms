class methodoverloading
{
	public static int add(int x, int y)
	{
		int z=x+y;
		return z;
	}
	public static double add(double a,double b)
	{
		double c=a+b;
		return c;
	}
	public static void main(String [] args)
	{
			methodoverloading v1=new methodoverloading();
			
			System.out.println(v1.add(10.0,20.50));
	}
}

		