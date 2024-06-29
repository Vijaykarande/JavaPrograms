import java.util.Scanner;
class circle
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		float r,area;
		System.out.println("Enter radius:");
		r=s.nextFloat();
		area=3.14f*r*r;
		System.out.println("area of circle is:"+area);
	}
}

		