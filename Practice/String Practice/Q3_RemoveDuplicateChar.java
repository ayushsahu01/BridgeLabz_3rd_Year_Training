public class Q3_RemoveDuplicateChar {
    public static void main(String[] args) {

        String str = "programming";

        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];

        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }

        System.out.println("Original: " + str);
        System.out.println("Without duplicates: " + result.toString());
    }
}