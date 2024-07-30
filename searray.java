class searray
{
	public static void main(String [] args)
	{
		int a=10;
		
		int arr[] ={10,20,30,40,50,60};
		boolean flag=false;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==a)
			{
				flag=true;
			}
		}
		if(flag)
		{
			System.out.println("PRESENT");
		}
		else
		{
			System.out.println("NOT PRESENT");
		}
	}
}
