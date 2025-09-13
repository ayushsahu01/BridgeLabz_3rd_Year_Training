package Inheritance1;


/*
 * Inheritance: Person -> Student -> Teacher
 * Design a class hierarchy using inheritance:
 * - Base Class Person: fields: name, age; method: displayInfo()
 * - Subclass Student: field rollnumber, override displayInfo()
 * - Subclass Teacher: field subject, override displayInfo()
 * In the main method:
 * - create a student object and a teacher object
 * - call their displayInfo() on both objects
 * Tests: Reusability + extended behavior in subclasses
 */

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Adarsh", 19);
        p.displayInfo();
        
        Student s = new Student(19, "Ayush", 20);
        s.displayInfo();

        Teacher t = new Teacher("Computer Science", 21, "Anuj", 10);
        t.displayInfo();
    }
}
