interface Addtion
{
	void add();
}
class Substraction
{
	void sub()
	{
		int a=20;
		int b=30;
		int c=a-b;
		System.out.println(c);
	}
}
class Multiplication extends Substraction implements Addtion
{
	public void add()
	{
		int a=10;
		int b=40;
		int c=a+b;
		System.out.println(c);
	}
	void mul()
	{
		int a=12;
		int b=10;
		int c=a*b;
		System.out.println(c);
	}
}
class Division extends Multiplication
{
	void div()
	{
		int a=20;
		int b=70;
		int c=a/b;
		System.out.println(c);
	}
}
class hybridinheritance
{
	public static void main(String [] args)
	{
		Division d1=new Division();
		d1.add();
		d1.sub();
		d1.mul();
		d1.div();
	}
}

		