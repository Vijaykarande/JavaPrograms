import java. 	util.Scanner;
class darray4
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		
		int arr [][]=new int [3][3 ];
		
		System.out.println("Enter all values line by line:");
		for(int i=0;i<=2;i++)
			for(int j=0;j<=2;j++)
				arr[i][j]=s.nextInt();
			System.out.println("Print element:");
			for(int i=0;i<=2;i++)
			{
				for(int j=0;j<=2;j++)
				{
				System.out.print(arr[i][j]+" ");
				}
				System.out.println("");
			}
	}
}
