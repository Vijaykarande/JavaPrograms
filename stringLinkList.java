import java.util.*;
class stringLinkList
{
	public static void main(String args)
	{
		LinkedList a1=new LinkedList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+" ");
		}
	}
	
}
