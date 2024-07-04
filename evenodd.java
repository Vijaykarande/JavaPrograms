import java.util.Scanner;
class evenodd
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number:");
		int no;
		no=s.nextInt();
		if(no%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}

		