// Superclass
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void displayRole() {
        System.out.println("Generic Person");
    }
}

// Subclass Teacher
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Teacher");
        displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("-------------------------");
    }
}

// Subclass Student
class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Student");
        displayInfo();
        System.out.println("Grade: " + grade);
        System.out.println("-------------------------");
    }
}

// Subclass Staff
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Staff");
        displayInfo();
        System.out.println("Department: " + department);
        System.out.println("-------------------------");
    }
}

public class SchoolSystemTest {
     public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice Johnson", 35, "Mathematics");
        Student student = new Student("Bob Smith", 16, "10th Grade");
        Staff staff = new Staff("Charlie Brown", 40, "Administration");

        // Demonstrating hierarchical inheritance
        Person[] people = {teacher, student, staff};

        for (Person p : people) {
            p.displayRole();
        }
    }
}
