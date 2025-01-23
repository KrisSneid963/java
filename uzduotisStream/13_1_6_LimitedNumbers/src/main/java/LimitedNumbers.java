import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class LimitedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers. it will stop when you will enter negative number:");


        List<Integer> numbers = scanner.tokens()
                .map(Integer::valueOf)
                .takeWhile(num -> num >= 0)             //  - nr entered
                .filter(num -> num >= 1 && num <= 5)    // nr 1 to 5
                .collect(Collectors.toList());


        numbers.forEach(System.out::println);
    }
}
