class methodoverloadingr2
{
	public static int add(int a,int b, int c)
	{
		int v=a+b+c;
		return v;
	}
	public static double add(double a,double b,double c)
	{
		double v1=a+b+c;
		return v1;
	}
	public static void main(String [] args)
	{
		methodoverloadingr2 v2=new methodoverloadingr2();
		System.out.println(v2.add(2.0,45.6,67.8));
	}
}

