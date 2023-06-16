import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctions {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,2,3,17,1,8);

        //starts with a and takes elements from stream
        Optional<Integer> add = list.stream().reduce((a, b) -> a+ b);
        System.out.println(add.get());

        //average of numbers
        OptionalDouble avg = list.stream().mapToInt(e -> e).average();
        System.out.println(avg.getAsDouble());

        //first find square of number then filter if it is greater than 100 then find total average

        double ans = list.stream().map(e -> e * e).filter(e -> e > 50).mapToInt(e -> e).average().getAsDouble();

        //now if we have to find numbers which are divisible by 2 or which are not simply use filter


        //filter numbers with prefix 2

        List<Integer> li = list.stream().
                map(String::valueOf).
                filter(e -> e.startsWith("2")).
                map(Integer::valueOf).
                collect(Collectors.toList());
        //or
        List<Integer> startsWith1 = list.stream().
                map(e -> String.valueOf(e)).
                filter(e -> e.startsWith("1")).
                map(e -> Integer.valueOf(e)).
                collect(Collectors.toList());


        System.out.println(li);

        Optional<Integer> max = list.stream().sorted(Collections.reverseOrder()).findFirst();
        Optional<Integer> min = list.stream().sorted().findFirst();
        System.out.println(max.get());
        System.out.println(min.get());

        //sum of first 5 numbers
        int s5 = list.stream().limit(5).reduce((p, q) -> p+q).get();

        //ignore fist 5 numbers
        int i5 = list.stream().skip(5).reduce((p, q) -> p+q).get();

        System.out.println(s5);
        System.out.println(i5);

        //second-highest number
        int h2 = list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();

        //second-lowest number
        int l2 = list.stream().distinct().sorted().skip(1).findFirst().get();

        System.out.println(h2);
        System.out.println(l2);

        //Count occurrences of each character

        String str = "ilovefootball";
        String arr[] = str.split("");
        Map<String , Long> counter = Arrays.stream(arr).collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        counter.forEach((key, val) -> System.out.println("Key ->" + key + "Value ->" + val));

        //Find Duplicates from above string
        List<String> counter2 = Arrays.stream(str.split("")).
                collect(Collectors.groupingBy(e -> e, Collectors.counting())).
                entrySet().stream().
                filter(x -> x.getValue() > 1).
                map(e -> e.getKey()).
                collect(Collectors.toList());

        //in case of non duplicates simply use value == 1 in filter

        //in case of find first non repeating


        String first = Arrays.stream(str.split("")).
                collect(Collectors.groupingBy(e -> e, Collectors.counting())).
                entrySet().stream().
                filter(x -> x.getValue() == 1).findFirst().get().getKey();

        System.out.println(first);

        List<String> words = Arrays.asList("hello", "wait", "good", "howareyou");
        //Longest word in string
        String longestWord = words.stream().reduce((a, b) -> a.length() > b.length() ? a : b).get();

        //join integers like 1-2
        String join = String.join("-", list.stream().map(String :: valueOf).collect(Collectors.toList()));

        System.out.println(join);



    }
}
