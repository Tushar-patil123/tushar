class Calculator {
    // Function Overloading

    // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two double values
    double add(double a, double b) {
        return a + b;
    }
}

// Class demonstrating Constructors and Returning by Reference
class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    // Method to display student details
    void display() {
         System.out.println("Name: " + name + ", Age:" + age);
    }

    // Method returning reference to current object
    Student getStudent() {
        return this;
    }
}

public class FunctionDemo {
     public static void main(String[] args) {
     // ----- Function Overloading -----
     Calculator calc = new Calculator();
     System.out.println("Add two integers: " + calc.add(5,10));
     System.out.println("Add three integers: " + calc.add(5,10,15));
     System.out.println("Add two doubles: " + calc.add(5.5, 4.5));

     // ----- Constructor -----
     Student s1 = new Student();                                  // DSefault constructor
     Student s2 = new Student("Tushar", 19);                  // Paramererized constructor
     Student s3 = new Student(s2);                                // copy constructor

     s1.display();
     s2.display();
     s3.display();
     

     // ----- Returning  by References -----
     Student s4 = s2.getStudent(); // returns reference of s2
     System.out.println("Student s4 details (reference to s2):");
     s4.display();

     }
}
