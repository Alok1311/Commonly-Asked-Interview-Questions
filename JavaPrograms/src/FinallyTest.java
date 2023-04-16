public class FinallyTest {
    public int method() {
        int i = 0;
        try {
            throw new Exception("Some Exception");
        } catch (Exception e) {
            i = 1;
        }
        finally {
            i = 10;
        }
        return i;
    }
    public int method2() {
        int i = 0;
        try {
            throw new Exception("Some Exception");
        } catch (Exception e) {
            return i;
        } finally {
            i = 10;
        }
    }

    public static void main(String... args) {

    }
}
