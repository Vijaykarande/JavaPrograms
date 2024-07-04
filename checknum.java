import java.util.Scanner;
class checknum
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Any number:");
		int no=s.nextInt();
		
		if(no>0)
		{
			System.out.println("Positive");
		}
		if(no<0)
		{
			System.out.println("Negative");
		}
		if(no==0)
		{
			System.out.println("Zero");
		}
	}
}
