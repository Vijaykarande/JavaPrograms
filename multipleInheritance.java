interface Addition
{
	void add();
}
class Substraction
{
	void sub()
	{
		int a=20;
		int b=40;
		int c=a-b;
		System.out.println(c);
	}
}
class Multiplication extends Substraction implements Addition
{
	public void add()
	{
		int a=30;
		int b=30;
		int c=a+b;
		System.out.println(c);

	}
	void mul()
	{
		int a=20;
		int b=0;
		int c=a*b;
	System.out.println(c);
	}
}
class multipleInheritance
{
	public static void main(String [] args)
	{
		Multiplication m1=new Multiplication();
		m1.add();
		m1.sub();
		m1.mul();
	}
}
