public class MainClass {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a.speak());
        Animal b = new Cat();
        System.out.println(b.speak());
    }
}
