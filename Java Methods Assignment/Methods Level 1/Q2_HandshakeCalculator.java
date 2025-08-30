import java.util.*;
public class Q2_HandshakeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int maxHandshakes = calculateHandshakes(numberOfStudents);

        System.out.println("The maximum number of possible handshakes among " 
                           + numberOfStudents + " students is " + maxHandshakes);
        sc.close();
    }
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
