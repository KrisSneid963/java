package src;

import java.util.function.Consumer;

public class ConsumerInterface {

    public static void main(String[] args) {
        final String java = "Java";
        Consumer<String> javaFunction = (text) -> System.out.println(text + " is awesome! ");
        javaFunction.accept(java);
    }
}