class encapsulation1
{
	private int balance;
	public int getbalance()
	{
		return balance;
	}
	public void setBalance(int balance)
	{
		if(balance>0)
		{
			System.out.println("total blance:"+balance);
		}
		else
		{
			System.out.println("Blance cannot be zero");
		}
	}
	public static void main(String [] args)
	{
		System.out.println("MS");
		
		encapsulation1 e1=new encapsulation1();
		e1.setBalance(12);
		System.out.println(e1.getbalance());
	}
}
