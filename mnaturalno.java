class mnaturalno
{
	public static int mul(int a)
	{
		if(a>1)
		{
			return a*mul(a+1);
		}
		else
		{
			return 0;
		}
	}
	public static void main(String [] args)
	{
		System.out.println(mul(5));
	}
}
