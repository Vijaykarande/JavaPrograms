class array7
{
	public static void main(String [] args)
	{
		int arr [] ={1,2,3,4,5,6,7,8,90,12,1,0,2,30};
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i] %2 != 0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
