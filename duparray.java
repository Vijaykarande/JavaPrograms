class duparray
{
	public static void main(String [] args)
	{
		int arr[]={20,20,30,40,50,60,70,40,60};
		for(int i=0;i<=arr.length -1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if((arr[i] == arr[j]) && (i != j))
				{
					System.out.println("duplicate:"+arr[j]);
				}
			}
		}
	}
}
