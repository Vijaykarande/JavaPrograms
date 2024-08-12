import java.util.*;
class studentsort implements Comparable
{
	String name;
	int weight;
	
	studentsort(String name, int weight)
	{
		this.name=name;
		this.weight=weight;
	}
	@Override
	public String toString()
	{
		return "name:"+name+"Weight:"+weight;
	}
	
	@Override
	public int compareTo(Object o)
	{
	studentsort temp=(studentsort) o;
	
	if(this.weight >temp.weight)
	{
		return 1;
	}
	if(this.weight< temp.weight)
	{
		return -1;
	}
	return 0;
}
public static void main(String [] args)
{
	studentsort b1=new studentsort("JAVA", 50);
	studentsort b2=new studentsort("PYTHON", 90);
	
	studentsort arr[]={b1,b2};
	Arrays.sort(arr);
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]);
	}
}
}
