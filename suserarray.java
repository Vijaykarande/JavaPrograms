import java.util.Scanner;
class suserarray
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		int arr[]=new int [5];
		for(int i=0;i<=4;i++)
		{
			System.out.println("Insert Element At:"+(i+1));
			arr[i]=s.nextInt();
		}
		for(int i=0;i<=4;i++)
		{
			System.out.println("Value at:"+arr[i]);
		}
	}
}
