public class Q2_FirstN0RepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";

        int[] freq = new int[256];

        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        char result = 0;
        for (char ch : str.toCharArray()) {
            if (freq[ch] == 1) {
                result = ch;
                break;
            }
        }

        if (result != 0) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}