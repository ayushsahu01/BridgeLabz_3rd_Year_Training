public class Q3_Person {
    // Attributes
    String name;
    int age;

    // Default constructor
    public Q3_Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Q3_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Q3_Person(Q3_Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Display method
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        System.out.println("-----------------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Using parameterized constructor
        Q3_Person person1 = new Q3_Person("Alice", 25);

        // Using copy constructor
        Q3_Person person2 = new Q3_Person(person1);

        // Display both persons
        System.out.println("Original Person:");
        person1.displayPersonDetails();

        System.out.println("Cloned Person:");
        person2.displayPersonDetails();
    }    
}
