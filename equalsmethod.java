class equalsmethod
{
	String name;
	int noOfPages;
	double price;
	
	equalsmethod(String name, int noOfPages, double price)
	{
		this.name=name;
		this.noOfPages=noOfPages;
		this.price=price;
	}
	
	public static void main(String [] args)
	{
		equalsmethod e1=new equalsmethod();
		equalsmethod e2=e1;
		System.out.println(e1==e2);
	}
}
