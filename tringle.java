
import java.util.Scanner;
class tringle
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		
		float base,height,area;
		System.out.println("Enter base:");
		base=s.nextFloat();
		System.out.println("Enter height:");
		height=s.nextFloat();
		area=0.5f*base*height;
		System.out.println("Area of rect are:"+area);
	}
}

		