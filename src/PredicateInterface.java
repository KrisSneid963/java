package src;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(7));
    }
}
