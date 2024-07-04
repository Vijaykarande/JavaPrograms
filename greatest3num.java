import java.util.Scanner;
class greatest3num
{
	public static void main(String [] args)
	{
	
	Scanner s=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter 3 numbers:");
		n1=s.nextInt();
		n2=s.nextInt();
		n3=s.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.println("n1 greter");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("n2 greter");
		}
		else if(n3>n1 && n3>n2)
		{
			System.out.println("n3 greter");
		}
		else
		{
			System.out.println("hello vijay");
		}
	}
}

		