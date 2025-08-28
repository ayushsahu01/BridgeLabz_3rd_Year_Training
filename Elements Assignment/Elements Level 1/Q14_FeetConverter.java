import java.util.Scanner;
public class Q14_FeetConverter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();

        
        double yards = feet / 3.0;

       
        double miles = yards / 1760.0;

       
        System.out.println("The distance " + feet + " feet is equal to " 
                           + yards + " yards and " + miles + " miles.");

        sc.close();
    }
}
    
