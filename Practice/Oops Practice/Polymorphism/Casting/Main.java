public class Main {
    public static void main(String[] args) {
        //UpCast
        Parent p = new Child();
        p.show();
        //p.display();

        //DownCast
        Child c = (Child)p;
        c.show();
    }
}
