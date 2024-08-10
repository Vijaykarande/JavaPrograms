import java.util.*;
class comparetomethod implements comparable
{
	String name;
	int price;
	
	comparetomethod(String name, int price)
	{
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString()
	{
		return "name:"+name+"price:"+price;
	}
	
	@Override
	public int CompareTo(Object o)
	{
	comparetomethod temp=(comparetomethod) o;
	
	if(this.price >temp.price)
	{
		return 1;
	}
	if(this.price < temp.price)
	{
		return -1;
	}
	return 0;
}
public static void main(String [] args)
{
	comparetomethod b1=new comparetomethod("JAVA", 500);
	comparetomethod b2=new comparetomethod("PYTHON", 600);
	
	comparetomethod arr[]={b1,b2};
	Arrays.sort(arr);
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]);
	}
}
}
