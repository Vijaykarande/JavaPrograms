import java.util.Scanner;
class artithme
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st and 2nd number:");
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a/b;
		System.out.println(c);
	}
}
