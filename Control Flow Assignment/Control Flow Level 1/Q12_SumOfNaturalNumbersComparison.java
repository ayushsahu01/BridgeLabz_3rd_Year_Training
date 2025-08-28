import java.util.Scanner;
public class Q12_SumOfNaturalNumbersComparison {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int formulaSum = n * (n + 1) / 2;

            int loopSum = 0;
            int counter = 1;
            while (counter <= n) {
                loopSum += counter;
                counter++;
            }

            System.out.println("Sum of " + n + " natural numbers using formula: " + formulaSum);
            System.out.println("Sum of " + n + " natural numbers using while loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct and match!");
            } else {
                System.out.println("The results do not match. Check the logic again.");
            }
        }

        sc.close();
    }
}