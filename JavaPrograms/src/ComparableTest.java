import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Employee implements Comparable<Employee>{
    int age;
    int id;

    public Employee(int age, int id) {
        this.age = age;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Employee o) {
        int i = this.id - o.id;
        if(i == 0)
            return this.age-o.age;
        return i;
    }

    @Override
    public String toString(){
        return this.age + " " + this.id;
    }
}
public class ComparableTest implements Comparator<Employee> {
    public static void main(String[] args) {
        Employee e1 = new Employee(19, 1);
        Employee e2 = new Employee(20, 2);
        Employee e3 = new Employee(25, 1);

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);

        for(Employee e : arrayList) {
            System.out.println(e);
        }
        Collections.sort(arrayList);

        for(Employee e : arrayList) {
            System.out.println(e);
        }
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return 0;
    }
}
