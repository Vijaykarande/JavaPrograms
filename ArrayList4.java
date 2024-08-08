import java.util.ArrayList;
class ArrayList4
{
	public static void main(String args[])
	{
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		
		System.out.println(a1);
		
		
		ArrayList a2=new ArrayList(a1);
		a2.add(60);
		a2.add(70);
		a2.add(80);
		a2.add(90);
		System.out.println(a2);
		
		a1.indexOf(a2);
		System.out.println(a1);
	}
}
