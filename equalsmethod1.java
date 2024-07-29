class equalsmethod1
{
	String name;
	int noOfPages;
	double price;
	
	equalsmethod1(String name, int noOfPages, double price)
	{
		this.name=name;
		this.noOfPages=noOfPages;
		this.price=price;
	}
	
	public static void main(String [] args)
	{
		equalsmethod1 e1=new equalsmethod1();
		equalsmethod1 e2=e1;
		System.out.println(e1==e2);
	}
}
