import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ExceptionExample {

    public int method() {
        try {
            return 100/0;
        }
        catch (ArithmeticException e) {
            throw new RuntimeException();
        }
    }

    public void file() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("notepad.txt");
    }
}
public class ExceptionTest {

    public static void main(String[] args) throws FileNotFoundException {
        ExceptionExample eg = new ExceptionExample();
        int val = eg.method();
        eg.file();
    }
}
