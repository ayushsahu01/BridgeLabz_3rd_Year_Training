public class AreaCalculator {
    public int area(int side){
        return side * side;
    }
    public int area(int length, int breadth){
        return length * breadth;
    }
    public double area(double radius){
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        AreaCalculator AC = new AreaCalculator();
        System.out.println(AC.area(5));
        System.out.println(AC.area(5,10));
        System.out.println(AC.area(5.5));
    }
}
