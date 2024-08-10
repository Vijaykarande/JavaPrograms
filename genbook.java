import java.util.*;
class genbook
{
	String name;
	double price;
	int noOfpages;
	
	genbook(String name , double price , int noOfpages)
	{
		this.name=name;
		this.price=price;
		this.noOfpages=noOfpages;
	}
	@Override
	public string toString()
	{
		return "name:"+name+"price:"+price+"noOfpages:"+noOfpages;
	}
}
public gencollection2
{
	public static void main(String [] args)
	{
		ArrayList <genbook> a1=new ArrayList<genbook>();
		genbook b1=new genbook("Java",450.60,300);
		genbook b2=new genbook("Python",509,600);
		
		a1.add(b1);
		a1.add(b2);
		
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}