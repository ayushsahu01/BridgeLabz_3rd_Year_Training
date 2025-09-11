public class MathUtils {
    public int add(int a, int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        MathUtils mu = new MathUtils();
        System.out.println(mu.add(5,15));
        System.out.println(mu.add(0.5, 0.15));
        System.out.println(mu.add(5,10, 15));
    }
}
