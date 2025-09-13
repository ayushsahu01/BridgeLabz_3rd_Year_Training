package Multiple_Inheritance;

public class ChildImpl implements IParent1, IParent2{
    @Override
    public void m1(){
        System.out.println("In Parent 1");
    }
    @Override
    public void m2(){
        System.out.println("In Parent 2");
    }
}
