interface abc {
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
interface def {
    int random();
}
class someClass implements  abc, def {

    @Override
    public int random() {
        return 12;
    }
    @Override
    public String defaultMethod() {
        return "Default from child";
    }
}

//interface eg1 {
//    void show();
//}
//interface eg2 {
//    int show();
//}
//class someClass2 implements eg1, eg2 {
//
//    @Override
//    public void show() {
//
//    }
//}

//interface eg1 {
//    static int show() {
//        return 1;
//    }
//}
//interface eg2 {
//    static String show() {
//        return "Hello";
//    }
//}
//class someClass2 implements eg1, eg2 {
//    public int show() {
//        return 1;
//    }
//}
public class MultipleInheritanceUsingInterface {

}
