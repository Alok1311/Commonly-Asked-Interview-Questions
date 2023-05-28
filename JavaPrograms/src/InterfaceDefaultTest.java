interface inte1 {
    default void method() {
        System.out.println("Interface 1");
    }
}
interface inte2 {
    default void method() {
        System.out.println("Interface 2");
    }
}

//InterfaceDefaultTest inherits unrelated defaults for method() from types inte1 and inte2
//public class InterfaceDefaultTest implements inte1, inte2{
//    public static void main(String[] args) {
//        InterfaceDefaultTest interfaceDefaultTest = new InterfaceDefaultTest();
//        interfaceDefaultTest.method();
//    }
//}
