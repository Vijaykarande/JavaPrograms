interface test
{
	void testing();
}
interface devlope
{
	void developing();
}
class capgemini
{
	void work()
	{
	System.out.println("Employee work:");
	}
	
}
class employee extends capgemini implements devlope,test
{
	@Override
	public void testing()
	{
		System.out.println("Testing");
	}
	
	@Override
	public void developing()
	{
		System.out.println("Developing");
	}
	
	//optional method of the class capgemini
}
class  employeecap
{
	public static void main(String [] args)
	{
		employee e1=new employee();
		e1.testing();
		e1.developing();
		e1.work();
	}
}

