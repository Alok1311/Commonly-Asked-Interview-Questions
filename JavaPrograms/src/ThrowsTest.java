import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsTest {
public void throwTest() throws FileNotFoundException {
    FileInputStream fileInputStream = new FileInputStream(new File("notes.txt"));
}
public static void main(String[] args) {
    ThrowsTest throwsTest = new ThrowsTest();
    try {
        throwsTest.throwTest();
    }
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }

}
}
