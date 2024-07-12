class thisconstructor
{
	String name;
	int rollno;
	int age;
	char gender;
	double marks;
	String result;
	
	{
		System.out.println("MLNSI 1");
	}
	
	{
		System.out.println("MLNSI 2");
	}
	
	thisconstructor(String name, int rollno, int age, char gender, double marks, String result)
	{
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.gender=gender;
		this.marks=marks;
		this.result=result;
	}
	public static void main(String [] args)
	{
		thisconstructor v1=new thisconstructor("Vijay Karande", 12, 23, 'M', 99.99, "Pass");
		System.out.println(v1.name);
		System.out.println(v1.rollno);
		System.out.println(v1.age);
		System.out.println(v1.gender);
		System.out.println(v1.marks);
		System.out.println(v1.result);
	}
	{
		System.out.println("MLNSI 3");
	}
}
