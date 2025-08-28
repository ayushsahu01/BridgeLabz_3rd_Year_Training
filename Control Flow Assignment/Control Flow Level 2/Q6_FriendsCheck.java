import java.util.Scanner;
public class Q6_FriendsCheck {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = sc.nextInt();

        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Amar is the youngest with age " + ageAmar);
        } else if (ageAkbar < ageAnthony) {
            System.out.println("Akbar is the youngest with age " + ageAkbar);
        } else {
            System.out.println("Anthony is the youngest with age " + ageAnthony);
        }

   
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Amar is the tallest with height " + heightAmar + " cm");
        } else if (heightAkbar > heightAnthony) {
            System.out.println("Akbar is the tallest with height " + heightAkbar + " cm");
        } else {
            System.out.println("Anthony is the tallest with height " + heightAnthony + " cm");
        }

        sc.close();
    }
}
