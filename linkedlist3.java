import java.util.LinkedList;
class linkedlist3
{
	public static void main(String [] args)
	{
		LinkedList l1=new LinkedList();
		l1.add(30);
		l1.add(50);
		l1.add(60);
		l1.add(80);
		l1.add(100);
		
		l1.remove(0);
		l1.isEmpty();
		System.out.println(l1);
		System.out.println(l1);
		
		
		LinkedList l2=new LinkedList(l1);
		System.out.println(l2);
	}
}
