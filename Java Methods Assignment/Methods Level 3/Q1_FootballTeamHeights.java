import java.util.*;
public class Q1_FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }

        System.out.println("Heights of players: " + Arrays.toString(heights));

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Sum of Heights = " + sum + " cm");
        System.out.println("Mean Height = " + String.format("%.2f", mean) + " cm");
        System.out.println("Shortest Player Height = " + shortest + " cm");
        System.out.println("Tallest Player Height = " + tallest + " cm");
    }
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double findMean(int[] arr) {
        int sum = findSum(arr);
        return (double) sum / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

}
