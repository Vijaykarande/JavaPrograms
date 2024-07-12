class paraconstructor
{
	String name;
	int no;
	char gender;
	
	{
		System.out.println("Multiline non static initilizer 1");
	}
	
	{
		System.out.println("Multiline non static initilizer 2");
	}
	paraconstructor(String name, int no, char gender)
	{
	}
	public static void main(String [] args)
	{
		paraconstructor v1=new paraconstructor("Vijay",23,'M');
	}
}
