package Bank;

import java.util.Scanner;

public class BankServiceImpl implements IBankService{
    private Scanner sc = new Scanner(System.in);
    Object[] users = new User[10];
    private int count = 0;
    
    @Override
    public void addCustomer()
    {
        if(count < 10)
        {
            System.out.println("Enter User Details: ");
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.print("Enter Aadhar Number: ");
            long aadharNumber = sc.nextLong();
            sc.nextLine();
            System.out.print("Enter Address: ");
            String address = sc.nextLine();
            System.out.println("Enter Balance to deposit: ");
            int balance = sc.nextInt();

            User user = new User(name, age, aadharNumber, address, balance);
            users[count] = user; 
            count++;

            System.out.println("Customer Added Successfully!!");
            System.out.println("Your Account Number is: " + user.getAccount().getAccountNumber());
        }         
        else{
            System.out.println("Maximumm User limit reached!!");
        }      
    }
    
    @Override
    public void deposit()
    {
        long accountNumber = sc.nextLong();
        User user = findUserByAccount(accountNumber);
        if(user != null)
        {
            System.out.print("Enter amount to Deposit: ");
            double depositBal = sc.nextDouble();
            double currentBal = user.getAccount().getBalance();
            user.getAccount().setBalance(currentBal + depositBal);

            System.out.println("Balance Update Successfully!");
        }
    }   

    @Override
    public void withdraw()
    {
        long accountNumber = sc.nextLong();
        User user = findUserByAccount(accountNumber);

        if(user != null)
        {
            System.out.println("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            double currentBal = user.getAccount().getBalance();
            if(amount <= currentBal)
            {
                user.getAccount().setBalance(currentBal-amount);
            }
            

            System.out.println("Updated Balance: "+ user.getAccount().getBalance());
        }
    }

    @Override
    public void checkBalance()
    {
        long accountNumber = sc.nextLong();
        User user = findUserByAccount(accountNumber);

        if(user != null)
        {
            double currentBal = user.getAccount().getBalance();
            System.out.println("Current Balance: " + currentBal);
        }
    }

    @Override
    public void showUserDetails()
    {
        long accountNumber = sc.nextLong();
        User user = findUserByAccount(accountNumber);

        if(user != null)
        {
            System.out.println(user.toString());
            System.out.println(user.getAccount().toString());
        }
        else{
            System.out.println("Account not Found!");
        }
    }

    private User findUserByAccount(long accountNumber)
    {
        for(int i=0;i<10;i++)
        {
            User u = (User) users[i];
            if(u.getAccount().getAccountNumber() == accountNumber)
            {
                return u;
            }
        }
        return null;
    }
}
