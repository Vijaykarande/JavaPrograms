class paraconstructor3
{
	String name;
	int age;
	float marks;
	double cgpa;
	char gender;
	double salary;
	
	{
		System.out.println("MLNSI 1");
	}
	
	{
		System.out.println("MLNSI 2");
	}
	
	paraconstructor3(String n1, int a1, float m1, double c1, char g1, float s1)
	{
		name=n1;
		age=a1;
		marks=m1;
		cgpa=c1;
		gender=g1;
		salary=s1;
	}
	public static void main(String [] args)
	{
		paraconstructor3 v1=new paraconstructor3("Vijay Karande" , 25, 100, 10, 'M', 1000000);
		System.out.println(v1.name);
		System.out.println(v1.age);
		System.out.println(v1.marks);
		System.out.println(v1.cgpa);
		System.out.println(v1.gender);
		System.out.println(v1.salary);
	}
	
	{
		System.out.println("MLNSI 3");
	}
}
