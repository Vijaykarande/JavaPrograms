import java.util.ArrayList;
class ArrayToArrayList
{
	public static void main(String [] args)
	{
		int arr[]={10,20,30,40,50,60,70,80};
		
		ArrayList a1=new ArrayList();
		
		for(int i=0;i<=arr.length-1;i++)
			
		{

			a1.add(arr[i]);
		}
		
		System.out.println(a1);
	}
}
