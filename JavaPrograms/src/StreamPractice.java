import java.util.*;
import java.util.stream.Collectors;

class IdWithNameClass {
    String id;
    String name;

    IdWithNameClass(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class StreamPractice {

    public static void main(String[] args) {
        List<Integer> unsortedList = Arrays.asList(1,4,5,6,13,5,6);
        List<Integer> sortedListDesc = unsortedList.stream()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());
        for (Integer i : sortedListDesc) {
            System.out.println(i);
        }

        List<Integer> sortedList = unsortedList.stream()
                .sorted()
                .collect(Collectors.toList());

        for (Integer i : sortedList) {
            System.out.println(i);
        }


        IdWithNameClass idWithNameClass1 = new IdWithNameClass("Id1st", "name1");
        IdWithNameClass idWithNameClass2 = new IdWithNameClass("Id2nd", "name2");
        IdWithNameClass idWithNameClass3 = new IdWithNameClass("Id3rd", "name1");

        List<IdWithNameClass> nameClassList = new ArrayList<>();
        nameClassList.add(idWithNameClass1);
        nameClassList.add(idWithNameClass2);
        nameClassList.add(idWithNameClass3);
        List<String> idList = nameClassList.stream().filter(e -> e.name.equals("name1")).map(e-> e.id).collect(Collectors.toList());

        for(String id : idList) {
            System.out.println(id);
        }

    }
}
