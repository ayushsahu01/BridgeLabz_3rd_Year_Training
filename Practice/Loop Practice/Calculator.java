package Practise;
import java.util.*;
public class Calculator {

    public static int methodAddition(int a, int b){
        return a + b;
    }
    public static int methodSubtraction(int a, int b){
        return a - b;
    }
    public static int methodMultiplication(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first Element:");
        int a = sc.nextInt();
        System.out.print("Enter a second Element:");
        int b = sc.nextInt();
        System.out.print("Enter 1 for Addition, 2 for Subtraction and 3 for Multiplication :");
        int ope = sc.nextInt();

        switch (ope) {
            case 1:
                System.out.println(methodAddition(a, b));
                break;
            case 2:
                System.out.println(methodSubtraction(a, b));
                break;
            case 3:
                System.out.println(methodMultiplication(a, b));
                break;
        
            default:
                System.out.println("Inavlid Number you Enter.");
                break;
        }
    }
}
