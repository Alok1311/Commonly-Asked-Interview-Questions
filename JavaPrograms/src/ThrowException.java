class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
public class ThrowException {
    public static void main(String[] args) {
        int age = 17;
        if(age < 18) {
            throw new CustomException("Age is less than 18");
        }
    }
}
