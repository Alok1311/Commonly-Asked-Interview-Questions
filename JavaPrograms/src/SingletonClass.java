public class SingletonClass {

    private static SingletonClass single_instance = null;
    int i;
    private SingletonClass () {
        i=90;
    }
    public static SingletonClass getInstance() {
        if(single_instance == null) {
            single_instance = new SingletonClass();
        }
        return single_instance;
    }
    public static void main (String args[]) {
        SingletonClass first = SingletonClass.getInstance();
        System.out.println("First instance integer value:"+first.i);
        first.i=first.i+90;
        SingletonClass second = SingletonClass.getInstance();
        System.out.println("Second instance integer value:"+second.i);
    }
}