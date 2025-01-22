package src;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.Random;


public class SupplierInterface {

    public static void main(String[] args) {
        Supplier<String> randomGreeting = () -> {
            String[] greetings = new String[]{"Hi", "Hello", "Labas"};

            Random random = new Random();
            return greetings[random.nextInt(greetings.length)];
        };

        System.out.println(randomGreeting.get());

    }
}
