import java.util.LinkedList;
import java.util.Iterator;
class linkedlist5
{
	public static void main(String [] args)
	{
		LinkedList <String> l1=new LinkedList <String>();
		l1.add("Vijay");
		l1.add("Rajaram");
		l1.add("Karande");
		//System.out.println(l1);
		
		/* for(int ele : l1)
		{
			System.out.println(ele);
		}
		*/
		
		Iterator i=l1.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next()+ " ");
		}
	}
}