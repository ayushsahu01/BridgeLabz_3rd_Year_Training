public class Q3_BankAccountManagement {
    public static void main(String[] args) {
        // Create a normal bank account
        BankAccount acc1 = new BankAccount("ACC1001", "Riya", 5000);
        acc1.displayAccountDetails();

        // Perform transactions
        acc1.deposit(2000);
        acc1.withdraw(1500);
        System.out.println("Final Balance: " + acc1.getBalance());
        System.out.println();

        // Create a savings account
        SavingsAccount savAcc = new SavingsAccount("SAV2001", "Arjun", 10000, 5.5);
        savAcc.displaySavingsDetails();

        // Deposit and Withdraw in Savings
        savAcc.deposit(3000);
        savAcc.withdraw(12000);  // should show insufficient funds
    }
}

// Base class
class BankAccount {
    public String accountNumber;     // public → accessible everywhere
    protected String accountHolder;  // protected → accessible in subclasses
    private double balance;          // private → secure access only via methods

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal or insufficient funds.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
        System.out.println("-----------------------------");
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Demonstrating access to public & protected variables
    public void displaySavingsDetails() {
        System.out.println("Savings Account Number : " + accountNumber);  // public
        System.out.println("Savings Account Holder : " + accountHolder); // protected
        System.out.println("Balance (via getter)   : " + getBalance());  // private via getter
        System.out.println("Interest Rate          : " + interestRate + "%");
        System.out.println("=============================");
    }
}