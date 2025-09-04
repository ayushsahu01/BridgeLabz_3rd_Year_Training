import java.util.*;
public class Q6_NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Is Perfect? " + isPerfect(num));
        System.out.println("Is Abundant? " + isAbundant(num));
        System.out.println("Is Deficient? " + isDeficient(num));
        System.out.println("Is Strong? " + isStrong(num));
        sc.close();
    }
     public static int sumOfDivisors(int num) {
        int sum = 1; 
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int num) {
        if (num <= 1) return false;
        return sumOfDivisors(num) == num;
    }

    public static boolean isAbundant(int num) {
        if (num < 1) return false;
        return sumOfDivisors(num) > num;
    }

    public static boolean isDeficient(int num) {
        if (num < 1) return false;
        return sumOfDivisors(num) < num;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }
}
