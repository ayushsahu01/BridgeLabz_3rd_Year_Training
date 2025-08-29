import java.util.Scanner;
public class Q12_TriangleArea {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in cm): ");
        double baseCm = sc.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double heightCm = sc.nextDouble();

        
        double areaCm2 = 0.5 * baseCm * heightCm;

        
        double areaInch2 = areaCm2 / (2.54 * 2.54);

        System.out.println("The area of the triangle is " + areaCm2 + " square centimeters"
                + " and " + String.format("%.2f", areaInch2) + " square inches.");

        sc.close();
    }
}
