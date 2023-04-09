import java.util.Comparator;
import java.util.stream.Stream;

interface Writer {
    void write();
}
public class MethodReference {
    public static void method() {
        System.out.println("Writing from method reference");
    }

    public static void main(String[] args) {
        Writer writer = MethodReference :: method;
        writer.write();

        //max using stream

        Integer max = Stream.of(1,24,12,15,2).max(Comparator.comparing(Integer :: valueOf)).get();
    }

}
