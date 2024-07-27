class Person1 {
    String name;
    int age;

    // Constructor
    Person1() {
        System.out.println("NACC");
    }

    // Parameterized constructor
    Person1(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }
}

class Student extends Person1 {
    char gender;
    int id;

    // Default constructor
    Student() {
        super("Vijay", 26);
        System.out.println("NACC");
    }

    // Parameterized constructor
    Student(char gender) {
          // Call to the no-arg constructor of Person
        this.gender = gender;
    }

    // Parameterized constructor
    Student(char gender, int id) {
         // Call to the no-arg constructor of Person
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
        Student s1 = new Student('m', 12);
        s1.display();  // Call the display method to show the values
    }
}
