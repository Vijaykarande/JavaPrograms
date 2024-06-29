import java.util.Scanner;
class rect
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		
		float height,width,area;
		System.out.println("Enter height:");
		height=s.nextFloat();
		System.out.println("Enter width:");
		width=s.nextFloat();
		area=height*width;
		System.out.println("Area of rect are:"+area);
	}
}

		