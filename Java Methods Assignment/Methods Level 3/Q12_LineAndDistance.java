import java.util.*;
public class Q12_LineAndDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);

        if (x1 == x2) {
            System.out.println("The line is vertical: x = " + x1);
        } else {
            double[] result = findEquation(x1, y1, x2, y2);
            double slope = result[0];
            double intercept = result[1];
            System.out.println("Equation of Line: y = " + slope + "x + " + intercept);
        }

        sc.close();
    }
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double[] findEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);   
        double b = y1 - m * x1;             
        return new double[]{m, b};
    }
}
