class person {
    String name;
    int age;

    // No-arg constructor
    person() {
        System.out.println("NACC");
    }

    // Parameterized constructor
    person(String name, int age) {
        this(); // Calls the no-arg constructor
        this.name = name;
        this.age = age;
    }
}

class student extends person {
    char gender;
    int id;

    // Default constructor
    student() {
        super("Vijay", 26);
        System.out.println("NACC");
    }

    // Parameterized constructor with gender
    student(char gender) {
        this("Vijay", 26, gender, 0); // Calls the parameterized constructor
    }

    // Parameterized constructor with gender and id
    student(char gender, int id, String name, int age) {
		
		this.gender=gender;
		this.id=id;
		

	}

    // Parameterized constructor with all fields
    student(String name, int age, char gender, int id) {
        super(name, age); // Calls the parameterized constructor of Person
        this.gender = gender;
        this.id = id;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {
        student s1 = new student('m', 12);
        s1.display();  // Call the display method to show the values
    }
}
