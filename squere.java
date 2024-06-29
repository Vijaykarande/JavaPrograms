import java.util.Scanner;
class squere
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		
		float side,area;
		System.out.println("Enter side:");
		side=s.nextFloat();
		area=side*side;
		System.out.println("Area of sphere are:"+area);
	}
}

		