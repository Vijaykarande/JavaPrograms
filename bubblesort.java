class bubblesort
{
	public static void main(String [] args)
	{
		int arr [] = {10,20,30,40,50,60,70,1,2,3,4,5,6,7,8};
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp= arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+"");
		}
	}
}
