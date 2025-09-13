package Multiple_Inheritance;

public class Main {
    public static void main(String[] args) {
        IParent1 p1 = new ChildImpl();
        p1.m1();
        IParent2 p2 = new ChildImpl();
        p2.m2();
    }
}
