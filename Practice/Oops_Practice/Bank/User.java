package Bank;

public class User {
    private String userName;
    private int userAge;
    private long aadharNumber;
    private String userAddress;
    private BankAccount account;

    User(String userName, int userAge, long aadharNumber, String userAddress, long balance)
    {
        this.userName = userName;
        this.userAge = userAge;
        this.aadharNumber = aadharNumber;
        this.userAddress = userAddress;
        this.account = new BankAccount(generateAccNum(), balance);
    }

    private long generateAccNum()
    {
        return (long) (Math.random() * 9000000000L) + 1000000000L;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserName()
    {
        return userName;
    }

    public int getUserAge()
    {
        return userAge;
    } 

    public void setUserAge(int userAge)
    {
        this.userAge = userAge;
    }

    public long getAadharNumber()
    {
        return aadharNumber;
    }

    public void setAadharNumber(long aadharNumber)
    {
        this.aadharNumber = aadharNumber;
    }

    public String getuserAddress()
    {
        return userAddress;
    }

    public void setUserAddress(String userAddress)
    {
        this.userAddress = userAddress;
    }

    public BankAccount getAccount(){
        return account;
    }

    @Override
    public String toString()
    {
        return ("Username: " + userName + "\nAge: " + userAge + "\nAddress: " + userAddress + "\nAadhar Number: " + aadharNumber);
    }
}
