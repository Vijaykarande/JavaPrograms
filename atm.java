abstract class abstarctmethod
{
	abstract void deposite();
	abstract void withdraw();
}
class atm extends abstarctmethod
{
	@Override
	public void deposite()
	{
		System.out.println("Money deposite succesfully!!!");
	}
	@Override
	public void withdraw()
	{
		System.out.println("Money withdraw succesfully!!!");
	}
}
	class atmdriver
	{
		public static void main(String [] args)
		{
			atm a1=new atm();
			a1.deposite();
			a1.withdraw();
		}
	}

