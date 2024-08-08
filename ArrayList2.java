import java.util.ArrayList;
class ArrayList2
{
	public static void main(String [] args)
	{
	
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	
	ArrayList a2=new ArrayList(a1);
	a2.add(2000);
	System.out.println(a2);
	System.out.println(a1);
	System.out.println(a1.isEmpty());
	System.out.println(a1.size());
	System.out.println(a1.indexOf(30));
	System.out.println(a1.hashCode());
	System.out.println(a1.equals(a2));
	}
}

