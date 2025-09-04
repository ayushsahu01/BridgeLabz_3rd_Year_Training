public class Q1_Student {
    public static void main(String[] args) {
        // Create Student object
        Student s1 = new Student(101, "Riya", 8.5);
        s1.displayDetails();

        // Modify CGPA using setter
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA of " + s1.name + " : " + s1.getCGPA());
        System.out.println();

        // Create PostgraduateStudent object
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Arjun", 9.2, "Computer Science");
        pg1.displayPGDetails();
    }
}


class Student {
    public int rollNumber;     // public → accessible everywhere
    protected String name;     // protected → accessible in same package + subclasses
    private double CGPA;       // private → accessible only via methods

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public setter for CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0.0 and 10.0");
        }
    }

    // Display method
    public void displayDetails() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + CGPA);
        System.out.println("-----------------------------");
    }
}

// Subclass
class PostgraduateStudent extends Student {
    String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA); // call parent constructor
        this.specialization = specialization;
    }

    // Demonstrates access to protected variable
    public void displayPGDetails() {
        System.out.println("PG Student Name : " + name); // accessing protected member
        System.out.println("Specialization  : " + specialization);
        System.out.println("Roll Number     : " + rollNumber); // public accessible
        System.out.println("CGPA (via getter): " + getCGPA()); // private accessed using getter
        System.out.println("=============================");
    }
}