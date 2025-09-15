package Practice.Oops_Practice.BankQuestionBySir;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IBankService bankService = new BankServiceImpl();

        while (true) {
            System.out.println("\n--- SBI Bank ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Info");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: bankService.createAccount(); 
                break;    
                case 2: bankService.deposit(); 
                break;
                case 3: bankService.withdraw(); 
                break;
                case 4: bankService.checkBalance(); 
                break;
                case 5: bankService.displayInfo();
                break;
                case 6: 
                    System.out.println("Thank you");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}
