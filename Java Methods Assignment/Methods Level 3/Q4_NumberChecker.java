import java.util.*;
public class Q4_NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int[] reversed = reverseArray(digits);
        System.out.println("Reversed Digits Array: " + Arrays.toString(reversed));

        System.out.println("Arrays Equal? " + arraysEqual(digits, reversed));
        System.out.println("Is Palindrome? " + isPalindrome(num));
        System.out.println("Is Duck Number? " + isDuckNumber(num));
        sc.close();
    }
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
        }
        return rev;
    }

    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        int[] rev = reverseArray(digits);
        return arraysEqual(digits, rev);
    }

    public static boolean isDuckNumber(int num) {
        int[] digits = getDigits(num);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
}
