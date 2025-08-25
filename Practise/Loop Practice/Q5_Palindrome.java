package Practise;

public class Q5_Palindrome {
    public static void main(String[] args) {
        int num3 = 121;
        int temp = 121;
        int ans = 0;
        while(num3!=0){
            int res = num3%10;
            ans = ans*10+res;
            num3=num3/10;
        }
        if(temp == ans){
            System.out.println(temp+" is Palindrome");
        }
        else{
            System.out.println(temp+" is not a Palindrome");
        }
    }
}
