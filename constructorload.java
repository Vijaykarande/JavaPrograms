class constructorload
{
	String name;
	int age;
	char geneder;
	
	{
		System.out.println("Non initilizer executed");
	}
	constructorload()
	{
		System.out.println("Constructor executed");
	}
	public static void main(String [] args)
	{
		System.out.println("Mains Starts");
		constructorload v1=new constructorload();
		constructorload v2=new constructorload();
		System.out.println("Main Ends");
	}
}
