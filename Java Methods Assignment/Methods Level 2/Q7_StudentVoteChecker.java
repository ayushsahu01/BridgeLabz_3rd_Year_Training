import java.util.*;
public class Q7_StudentVoteChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q7_StudentVoteChecker checker = new Q7_StudentVoteChecker();

        int[] ages = new int[10]; 

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\nVoting Eligibility Results:");

        for (int i = 0; i < ages.length; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age entered!");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + "): Eligible to Vote ✅");
            } else {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + "): Not Eligible to Vote ❌");
            }
        }

        sc.close();
    }
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        } else if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
