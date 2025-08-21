package Practise;

public class Q2_Factorial {
    public static void main(String[] args) {
        int n = 5;
        int res = 1;
        while(n>0){
           res *= n;
           n--; 
        }
        System.out.println(res);
    }
}
