class mrecursion
{
	public void demo()
	{
		System.out.println("Vijay Karande");
		demo();
	}
	public static void main(String [] args)
	{
		mrecursion v1=new mrecursion();
		v1.demo();
	}
}
