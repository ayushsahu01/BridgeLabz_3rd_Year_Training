package Practise;

public class Q3_Fibonacci_Series {
    public static void main(String[] args) {
        int n2 = 10;
        int a = 0;
        int b = 1;
        int res2=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2; i<n2; i++){
            res2 = a+b;
            a=b;
            b=res2;
            System.out.print(res2+" ");
        }
        System.out.println();
    }
}
