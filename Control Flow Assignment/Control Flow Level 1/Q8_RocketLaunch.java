import java.util.Scanner;
public class Q8_RocketLaunch {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown starting number: ");
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--; 
        }

        System.out.println("Launch!");
        
        sc.close();
    }
}