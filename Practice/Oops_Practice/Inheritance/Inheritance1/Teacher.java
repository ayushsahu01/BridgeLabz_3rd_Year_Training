package Inheritance1;

public class Teacher extends Student{
    private String Subject;

    Teacher(String Subject, int Age, String name, int rollNumber){
        super(rollNumber, name, Age);
        this.Subject = Subject;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Subject : " + Subject);
    }
}
