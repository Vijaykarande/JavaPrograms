class parent
{
	void display()
	{
		System.out.println("Hello1");
	}
}
class child extends parent
{
	void show()
	{
		System.out.println("Hello2");
	}
}
class upcasting1
{
	public static void main(String [] args)
	{
		parent p1=new child();//upcasting
		
		child c1=(child) p1;//downcasting
		
		p1.show();
	}
}
