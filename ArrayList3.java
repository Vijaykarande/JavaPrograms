import java.util.ArrayList;
class ArrayList3 
{
	public static void main(String [] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add(20);
		a2.add(40);
		a2.add(50);
		a2.add(60);
		a2.add(50);
		System.out.println(a2);
		
		System.out.println(a1.size());
		System.out.println(a2.size());
		
		
		System.out.println(a1.isEmpty());
		System.out.println(a2.isEmpty());
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		System.out.println(a1.equals(a2));
		System.out.println(a2.equals(a1));
		
		
	a1.add(a2);
	System.out.println(a1);
	}
}
