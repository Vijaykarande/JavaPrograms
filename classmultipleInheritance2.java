class java
{
	void show()
	{
		System.out.println("Java Is the best");
	}
}
class python
{
	void show()
	{
		System.out.println("Python is th best");
	}
}
class multipleInheritance2 extends java, python
{
	public static void main(String [] args)
	{
		multipleInheritance2 m1=new multipleInheritance2();
		m1.show();
	}
}

