import java.util.Scanner;
class swap
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 1st number:");
		a=s.nextInt();
		System.out.println("Enter 2nd number:");
		b=s.nextInt();
		System.out.println("1st number before swapping:"+a);
		System.out.println("2nd number before swapping:"+b);
		c=a;
		a=b;
		b=c;
		System.out.println("1st number after swapping:"+a);
		System.out.println("2nd number after swapping:"+b);
	}
}

		
		
		