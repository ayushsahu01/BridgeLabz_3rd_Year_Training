import java.util.*;
public class Q5_FrequencyOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Take character input
        System.out.print("Enter a character to find frequency: ");
        char target = sc.next().charAt(0);

        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}