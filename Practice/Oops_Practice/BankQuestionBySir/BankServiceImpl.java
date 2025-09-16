package BankQuestionBySir;

import java.util.Scanner;

public class BankServiceImpl implements IBankService{
    //concrete methods
   User []user = new User[10];
    int index=0;
    double [] balance= new double[10];
    Scanner sc= new Scanner(System.in);

    @Override
    public void createAccount(){
        if(index>10){
            System.out.println("No more accounts can be created");
            return;
        }
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your age");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your aadhar number");
        String aadhar=sc.nextLine();
        System.out.println("Enter initial deposit amount");
        balance[index]=sc.nextDouble();
        sc.nextLine();
        user[index]= new User(name, age, aadhar);
        System.out.println("Account created successfully for " + name + " with balance: " + balance[index]);
        System.out.println("Your Account ID is: " + index);
        index++;
        System.out.println("Account created successfully");
        
    }
    @Override
    public void deposit() {
        System.out.println("Enter your account ID");
        int accId=sc.nextInt();
        sc.nextLine();
        if (accId < 0 || accId >= index) {
            System.out.println("Invalid account ID");
            return;
            
        }
        System.out.println("Enter amount to be deposited");
        double amount=sc.nextDouble();
        sc.nextLine();
        if(amount<=0){
            System.out.println("Invalid amount");
            return;
        }
        balance[accId]+=amount;
        System.out.println("Your current balance is: " + balance[accId]);
        
    }
    @Override
    public void withdraw() {
        System.out.println("Enter your account ID");
        int accId=sc.nextInt();
        sc.nextLine();
        if (accId < 0 || accId >= index) {
            System.out.println("Invalid account ID");
            return;
            
        }
        System.out.println("Enter amount to be withdrawn");
        double amount=sc.nextDouble();
        sc.nextLine();
        if(amount<=0 || amount>balance[accId]){
            System.out.println("Invalid amount");
            return;
        }
        balance[accId]-=amount;
        System.out.println("Your current balance is: " + balance[accId]);
        
    }
    @Override
    public void checkBalance() {
        System.out.println("Enter your account ID");
        int accId=sc.nextInt();
        sc.nextLine();
        if (accId < 0 || accId >= index) {
            System.out.println("Invalid account ID");
            return;
            
        }
        System.out.println("Your current balance is: " + balance[accId]); 
    }
    @Override
    public void displayInfo() {
        System.out.println("Enter your account ID");
        int accId=sc.nextInt();
        sc.nextLine();
        if (accId < 0 || accId >= index) {
            System.out.println("Invalid account ID");
            return;
            
        }
        System.out.println("Account Holder Name: " + user[accId].getUserName());
        System.out.println("Account Holder Age: " + user[accId].getAge());
        System.out.println("Account Holder Aadhar Number: " + user[accId].aadhaarNumber);
        System.out.println("Account Balance: " + balance[accId]);
    }

}
