class mrecursion2
{
	public void table(int no)
	{
		if(no<=100)
		{
			System.out.println(no);
			no=no+10;
			table(no);
		}
	}
	public static void main(String [] args)
	{
		mrecursion2 v1=new mrecursion2();
		v1.table(10);
	}
}

			