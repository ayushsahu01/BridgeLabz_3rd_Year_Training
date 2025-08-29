import java.util.*;
public class Q2_FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.println("Enter age and height for Amar, Akbar, and Anthony:");
        for (int i = 0; i < friends.length; i++) {
            System.out.print(friends[i] + " - Enter Age: ");
            ages[i] = sc.nextInt();

            System.out.print(friends[i] + " - Enter Height (in cm): ");
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Youngest Friend: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");
        sc.close();
    }
}
