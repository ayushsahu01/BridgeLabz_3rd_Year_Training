package Inheritance1;

public class Person {
    private String name;
    private int Age;
    
    Person(String name, int Age){
        this.name = name;
        this.Age = Age;
    }

    public void displayInfo(){
       System.out.println("Name :" + name); 
       System.out.println("Age :" + Age); 
    }
}
