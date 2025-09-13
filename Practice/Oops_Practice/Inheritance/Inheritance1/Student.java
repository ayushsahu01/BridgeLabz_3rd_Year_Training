package Inheritance1;

public class Student extends Person{
    private int rollNumber;
    
    Student(int rollNumber, String name, int Age){
        super(name, Age);
        this.rollNumber = rollNumber;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();;
        System.out.println("Roll Number :" + rollNumber);
    }
}
