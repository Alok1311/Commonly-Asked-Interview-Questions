import java.util.*;
import java.util.stream.Collectors;

class Employees {
    Integer id;
    String name;
    Integer salary;
    String sex;
    String department;


    public Employees(Integer id, String name, Integer salary, String sex, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.sex = sex;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getSex() {
        return sex;
    }

    public String getDepartment() {
        return department;
    }
    public String getName() {
        return name;
    }
}
class Student {
    String name;
    int rollNumber;


    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
}

public class JavaStreamExample {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 2));
        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 3));
        students.add(new Student("Alice", 4));
        students.add(new Student("John", 5));




        Comparator<Student> byNameThenRollNumber = Comparator
                .comparing(Student::getName)
                .thenComparingInt(Student::getRollNumber);

        List<Student> sortedStudents = students.stream()
                .sorted(byNameThenRollNumber)
                .collect(Collectors.toList());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        Comparator<Integer> ascendingOrder = (a, b) -> a.compareTo(b);

        numbers.sort(ascendingOrder);

        System.out.println(numbers);  // Output: [1, 2, 3, 5, 8]

        students.forEach(student -> System.out.println(student.getName()));

        List<Employees> employees = new ArrayList<>();
        employees.add(new Employees(1,"Bob", 10000, "Male", "HR"));
        employees.add(new Employees(2,"Daisy", 20000, "Female", "BA"));
        employees.add(new Employees(3,"Aria", 20000, "Female", "HR"));
        employees.add(new Employees(4,"Jacob", 15000, "Male", "Developer"));
        employees.add(new Employees(5,"Sam", 20000, "Male", "Manager"));


        List<String> getAllDeps = employees.stream().map(Employees :: getDepartment).collect(Collectors.toList());

        getAllDeps.forEach(System.out::println);

        Map<String, Long> groupGender = employees.stream().collect(Collectors.groupingBy(Employees :: getSex,Collectors.counting()));


        groupGender.forEach((key, value) -> System.out.println("Sex" + key + "Count" + value));

        //1 way
        Comparator<Employees> comparator = (a, b) -> a.getSalary().compareTo(b.getSalary());

        //or
        Comparator<Employees> comparator2 = Comparator.comparing(Employees::getSalary);


        List<Employees> ans = employees.
                stream().
                sorted(Comparator.comparing(Employees ::getDepartment)).
                collect(Collectors.toList()).
                stream().
                sorted(Comparator.comparing(Employees::getSalary)).
                collect(Collectors.toList());

    }
}
