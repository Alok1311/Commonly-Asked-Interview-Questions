interface test1 {
    default void run() {
        System.out.println("Test1");
    }
}
//interface test2 {
//    default void run() {
//        System.out.println("Test2");
//    }
//}

class test3 {

    //if we make it public then no error will be if we don't override in child class.
    void run() {
        System.out.println("Test3");
    }
}

public class DefaultInterfaceTest extends test3 implements test1{

    public static void main(String[] args) {
        DefaultInterfaceTest defaultInterfaceTest = new DefaultInterfaceTest();
        defaultInterfaceTest.run();
    }

    @Override
    public void run() {
        super.run();
        test1.super.run();
    }
}
