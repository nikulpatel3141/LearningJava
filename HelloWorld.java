

public class HelloWorld {
    public static void main(String[] args) {
        int x = 42;
        String message = "Hello, World! %s";
        String formattedMessage = String.format(message, x);
        System.out.println(formattedMessage);
        System.out.println(x);
    }
}
