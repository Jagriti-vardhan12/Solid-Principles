package java8_com.jv;
@FunctionalInterface
interface MessagePrinter {
    void printMessage(String message);
}

public class Functional_greetingprinter {

	public static void greet(String message, MessagePrinter printer) {
        printer.printMessage(message);
    }

    public static void main(String[] args) {
        MessagePrinter printer = (msg) -> System.out.println("Greeting: " + msg);
        greet("Hello, welcome to Java functional interfaces!", printer);
    }
}
