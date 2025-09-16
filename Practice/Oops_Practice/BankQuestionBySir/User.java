package BankQuestionBySir;

public class User {
    private String userName;
    private int age;
    public String aadhaarNumber;
    
    public User(String userName, int age, String aadhaarNumber){
        this.userName=userName;
        this.age=age;
        this.aadhaarNumber=aadhaarNumber;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getUserName(){
        return userName;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return userName;
    }
}
