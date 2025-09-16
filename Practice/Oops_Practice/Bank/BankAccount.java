package Bank;

public class BankAccount {
    private long accountNumber;
    private double balance;

    BankAccount(long accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    @Override
    public String toString()
    {
        return ("Account Number: " + accountNumber + "\nCurrent Balance: " + balance);
    }
}
