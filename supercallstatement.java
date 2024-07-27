class person
{
	String name;
	int age;
	{
		person()
		{
			System.out.println("NACC");
		}
		person(String name, int age)
		{
			this();
			this.name=name;
			this.age=age;
		}
	}
	class student extends person
	{
		char gender;
			int id;
			
		student()
		{
			super("Vijay", 26);
			System.out.println("NACC");
		}
		student(char gender)
		{
			this.gender=gender;
		}
		student(char gender, int id)
		{
			this.gender=gender;
			this.id=id;
			super.name=name;
			super.age=age;
		}
		void display()
		{
			System.out.println("Name:"+name);
				System.out.println("age:"+age);
					System.out.println("gender:"+gender);
						System.out.println("id:"+id);
	}
	public static void main(String [] args)
	{
		student s1=new student('m', 12);
	}
	}
}

			