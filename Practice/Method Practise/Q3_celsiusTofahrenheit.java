import java.util.*;
public class Q3_celsiusTofahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Temperature in Celsius :");
        int cel = sc.nextInt();
        System.out.println(celtofeh(cel));
        sc.close();
    }
    public static double celtofeh(int cel){
        double feh = (cel * 9/5) + 32;
        return feh;
    }
}
