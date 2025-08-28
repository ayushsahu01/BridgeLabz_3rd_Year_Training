public class Q2_Find_Max {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 300;
        System.out.println(maxOut(a, b, c));    
    }
    public static int maxOut(int a, int b, int c){
        int max = 0;
        max = Math.max(a, max);    
        max = Math.max(b, max);    
        max = Math.max(c, max);
        return max;
    }
}
