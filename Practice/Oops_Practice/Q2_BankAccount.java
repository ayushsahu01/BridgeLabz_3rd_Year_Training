public class Q2_BankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1001, "Alice", 5000);
        BankAccount account2 = new BankAccount(1002, "Bob", 10000);

        BankAccount.withdraw(50000, account1);
        BankAccount.display(account1);
        BankAccount.deposit(600, account2);
        BankAccount.display(account2);

    }
}

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(int accNum, String name, double bal) {
        this.accountNumber = accNum;
        this.accountHolderName = name;
        this.balance = bal;
    }

    public static void deposit(double amount, BankAccount b) {
        b.balance += amount;
        System.out.println("Balance Updated!!");
    }

    public static void withdraw(double amount, BankAccount b) {
        if (b.balance >= amount) {
            b.balance -= amount;
            System.out.println("Balance Updated!!");
        }

        else {
            System.err.println("Unsufficient Balance!!");
        }

    }

    public static void display(BankAccount b) {
        System.out.println("Account Holder Name: " + b.accountHolderName);
        System.out.println("Account Number: " + b.accountNumber);
        System.out.println("Account Balance: " + b.balance);
    }
}
