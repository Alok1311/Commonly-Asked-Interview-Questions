interface inte1 {
    default void method() {
        System.out.println("Interface 1");
    }
    default void method2() {
        System.out.println("method2");
    }
}
interface inte2 {
    default void method() {
        System.out.println("Interface 2");
    }
}
public class InterfaceDefaultTest implements inte1, inte2{
    public static void main(String[] args) {
        InterfaceDefaultTest interfaceDefaultTest = new InterfaceDefaultTest();
        interfaceDefaultTest.method();
    }

    @Override
    public void method() {
        inte1.super.method();
    }

    public static void staticMethod() {
        InterfaceDefaultTest interfaceDefaultTest = new InterfaceDefaultTest();
        interfaceDefaultTest.method2();
    }

    /**
     * WE CANNOT CREATE SOME OTHER METHOD TO CALL METHOD, WE WILL HAVE TO OVERRIDE TO CALL
     * ONE WHEN 2 CLASSES ARE IMPLEMENTED, HOWEVER INCASE OF 1 CLASS WE CAN BUT NOT IN TERMS OF STATIC
     *
     * EVEN IF WE DON'T CALL WE WILL GET COMPILE ERROR IF 2 METHOD OF SAME NAME IN INTERFACE AS THEY
     * MUST BE OVERRIDEN
     *
     *
     */
}
