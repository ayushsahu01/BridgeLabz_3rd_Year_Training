// Superclass
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("-------------------------");
    }
}

// Subclass CheckingAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayInfo();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
        System.out.println("-------------------------");
    }
}

// Subclass FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    int maturityPeriod; // in months

    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayInfo();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
        System.out.println("-------------------------");
    }
}

public class BankSystemTest {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA1001", 5000, 3.5);
        CheckingAccount checking = new CheckingAccount("CA2001", 2000, 1000);
        FixedDepositAccount fixed = new FixedDepositAccount("FD3001", 10000, 12);

        // Demonstrating hierarchical inheritance
        BankAccount[] accounts = {savings, checking, fixed};

        for (BankAccount acc : accounts) {
            acc.displayAccountType();
        }
    }
}
