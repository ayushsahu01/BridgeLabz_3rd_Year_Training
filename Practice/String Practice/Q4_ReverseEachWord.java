public class Q4_ReverseEachWord {
    public static void main(String[] args) {
        String str = "Hello World from Java";

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder rev = new StringBuilder(word);
            result.append(rev.reverse().toString()).append(" ");
        }
        System.out.println("Original: " + str);
        System.out.println("Reversed words: " + result.toString().trim());
    }
}