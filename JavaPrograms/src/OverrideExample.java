class Parent {

    public void method() {
        System.out.println("Method of Parent");
    }
}
public class OverrideExample extends Parent{
    @Override
    public void method() {
        System.out.println("Method of Child");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.method();//method of parent called

        Parent p2 = new OverrideExample();
        p2.method();//method in child called as override
    }
}
