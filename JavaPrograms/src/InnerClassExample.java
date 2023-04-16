public class InnerClassExample {
    private int a = 10;

    private String string;

    InnerClassExample() {
        this.string = "Outer Class";
    }

    class InnerClass {
        public int getInnerClassExample() {
            InnerClassExample innerClassExample = new InnerClassExample();
            innerClassExample.a = 20;

            return innerClassExample.a;
        }

        public void changeString() {
            InnerClassExample.this.string = "Changed From Inner Class";
        }
    }

    public static void main(String[] args) {
        InnerClassExample innerClassExample = new InnerClassExample();
        InnerClassExample.InnerClass innerClass = innerClassExample.new InnerClass();
        System.out.println(innerClassExample.a);

        System.out.println(innerClass.getInnerClassExample());
        System.out.println(innerClassExample.string);
        innerClass.changeString();
        System.out.println(innerClassExample.string);
    }
}
