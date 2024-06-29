import java.util.Scanner;
import java.util.Arrays;

class passarrayvalue
{
	public static void main (String [] args)
	{
		Scanner s=new Scanner(System.in);
		
		int arr[]={20,30,40,50,60};
		int newarr[]=new int[4];
		int index;
		int value;
		System.out.println("Enter index");
		index=s.nextInt();
		System.out.println("Enter value");
		value=s.nextInt();
		System.out.println("Before insertion:"+Arrays.toString(arr));
		for(int i=0,j=0; i<=newarr.length;i++)
		{
			if(index != i)
			{
				newarr[i]=arr[j];
				j++;
				
			}
			else
			{
				newarr[i]=value;
			}
			System.out.println("After insertion:"+Arrays.toString(newarr));
		}
	
	}
}

		
		
	