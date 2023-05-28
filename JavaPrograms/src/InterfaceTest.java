interface A {
    int var = 10;
    int random();
    static int value() {
        return 1;
    }
    default String defaultMethod() {
        return "Default Method";
    }

    default String defaultMethod2() {
        return "Default Method from Parent";
    }
}
class Ac implements  A {

    public static final int var = 20;
    @Override
    public int random() {
        return 12;
    }
    @Override
    public String defaultMethod() {
        return "Default from child";
    }
}
public class InterfaceTest {
   
    public static void main(String[] args) {
        Ac ac = new Ac();
        int var = ac.var;
        System.out.println(var);

        int random = ac.random();
        System.out.println(random);

        int val = A.value();
        System.out.println(val);

        int var2 = A.var;
        System.out.println(var2);

        System.out.println(ac.defaultMethod());

        System.out.println(ac.defaultMethod2());
        A a = new Ac();

        int var1 = a.var;
        System.out.println(var1);
    }
    
}
