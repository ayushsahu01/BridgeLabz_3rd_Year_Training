package Bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IBankService bankService = new BankServiceImpl();

        while (true) {
            System.out.println("\n=== Bank Management System ===");
            System.out.println("1. Add New Customer");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Show User Details");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    bankService.addCustomer();
                    break;
                    
                case 2:
                    System.out.print("Enter Account Number: ");
                    long depositAccNo = sc.nextLong();
                    bankService.deposit();
                    break;
                    
                case 3:
                    System.out.print("Enter Account Number: ");
                    long withdrawAccNo = sc.nextLong();
                    bankService.withdraw();
                    break;
                    
                case 4:
                    System.out.print("Enter Account Number: ");
                    long balanceAccNo = sc.nextLong();
                    bankService.checkBalance();
                    break;
                    
                case 5:
                    System.out.print("Enter Account Number: ");
                    long detailsAccNo = sc.nextLong();
                    bankService.showUserDetails();
                    break;
                    
                case 6:
                    System.out.println("Thank you for using our banking system!");
                    sc.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
