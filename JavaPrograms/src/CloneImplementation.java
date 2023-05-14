class CloneableClassExample implements Cloneable{
    int i;
    int j;

    CloneableClassExample(){}
    CloneableClassExample(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return ("i -> " + i + " j -> " + j );
    }
}
public class CloneImplementation {
    public static void main (String[] args) throws CloneNotSupportedException {

        /**Shallow Copy
         * IN SHALLOW COPY ONLY REFERENCE IS CREATED THE OBJECT REMAINS SAME, SO BIG PROBLEM IS THAT
         * IF WE CHANGE IN OBJ2 VALUE WILL BE CHANGED IN OBJ1 AS WELL
         */
        CloneableClassExample obj1 = new CloneableClassExample(2, 6);
        CloneableClassExample obj2 = obj1;

        obj2.i = 4;

        System.out.println("obj2 ->" + obj2);
        System.out.println("obj1 ->" + obj1);

        /**Deep Copy
         * VIA DEEP COPY WE HAVE TO MANUALLY CREATE A NEW OBJECT AND COPY ALL THE VARIABLES FROM DESIRED OBJECT,
         * THIS SOLVES ISSUE IN SHALLOW COPY BUT IS INEFFECTIVE IN CASE THERE ARE MANY VARIABLES
         */

        CloneableClassExample obj3 = new CloneableClassExample();
        obj3.i = obj1.i;
        obj3.j = obj1.j;

        obj3.j = 10;

        System.out.println("obj3 -> " + obj3);
        System.out.println("obj1 -> " + obj1);

        /**
         * VIA CLONE WE SOLVE BOTH THE PROBLEMS FROM ABOVE BY SIMPLY CALLING CLONE METHOD WE CAN
         * CLONE THE OBJECT BUT IT HAS FEW POINTS TO REMEMBER
         *
         * SINCE CLONE IN OBJECT HAS PROTECTED ACCESS SO WE NEED TO OVERRIDE AND REFER THE METHOD USING SUPER,
         * AFTER THAT WE NEED TO ADD THE CLONE NOT SUPPORTED EXCEPTION, NOW SINCE BECAUSE OF SECURITY ISSUES TO PREVENT
         * IT'S USAGE WE HAVE TO IMPLEMENT CLONEABLE MARKER INTERFACE
         */

        CloneableClassExample obj4 = (CloneableClassExample) obj1.clone();

        System.out.println("obj4 -> " + obj4);

    }
}
