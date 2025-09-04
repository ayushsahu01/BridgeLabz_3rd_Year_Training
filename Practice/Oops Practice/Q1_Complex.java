import java.util.*;
public class Q1_Complex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 7);
        Complex.display(c1);
        Complex.display(c2);
        
        Complex Sum = Complex.add(c1, c2);
        Complex Sub = Complex.sub(c1, c2);
        Complex Mul = Complex.mul(c1, c2);

        System.out.println("Addition :");
        Complex.display(Sum);
        System.out.println("Subtraction :");
        Complex.display(Sub);
        System.out.println("Multiplication :");
        Complex.display(Mul);
        sc.close();
    }
}

class Complex{
    int real, img;

    Complex(int real, int img){
        this.real = real;
        this.img = img;
    }

    public static void display(Complex c){
        System.out.print(c.real + " ");
        if(c.img > 0){
            System.out.println( "+ " + c.img  + "i" );
        }
        else{
            System.out.println(c.img  + "i" );
        }
    }
    public static Complex add(Complex c1, Complex c2){
        int realsum = c1.real + c2.real;
        int imgsum = c1.img + c2.img;
        return new Complex(realsum, imgsum);
    }
    public static Complex sub(Complex c1, Complex c2){
        int realsub = c1.real - c2.real;
        int imgsub = c1.img - c2.img;
        return new Complex(realsub, imgsub);
    }
    public static Complex mul(Complex c1, Complex c2){
        int realmul = c1.real*c2.real - c1.img*c2.img;
        int imgmul = c1.img*c2.real + c2.img*c1.real;
        return new Complex(realmul, imgmul);
    }
     
}
