import java.util.Scanner;
class swap3
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter 1st number:");
		a=s.nextInt();
		System.out.println("Enter 2nd number:");
		b=s.nextInt();
		System.out.println("1st number before swapping:"+a);
		System.out.println("2nd number before swapping:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("1st number after swapping:"+a);
		System.out.println("2nd number after swapping:"+b);
	}
}

		
		
		