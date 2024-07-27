class shape
{
	void show()
	{
	int area=12;
	System.out.println("Area:"+area);
	}
}
class circle extends shape
{
	void show1()
	{
	int radius=23;
	System.out.println("Radius:"+radius);
	}
}
class shapecircle
{
	public static void main(String [] args)
	{
		shape s1=new circle();//upcating
		
		circle c1=(circle) s1;//downcasting
		s1.show();
	}
}
