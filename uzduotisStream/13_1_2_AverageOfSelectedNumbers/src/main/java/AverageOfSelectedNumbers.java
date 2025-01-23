import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers, type \"end\" to stop:");

        //numbers to collect
        List<Double> numbers = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            try {
                numbers.add(Double.parseDouble(input));
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please try again.");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No numbers entered.");
            return;
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine().trim();

        // Filter avg  in stream
        numbers.stream()
                .filter(num -> choice.equalsIgnoreCase("n") ? num < 0 : num > 0)
                .mapToDouble(Double::doubleValue)
                .average()
                .ifPresentOrElse(
                        avg -> System.out.println((choice.equalsIgnoreCase("n")
                                ? "Average of the negative numbers: "
                                : "Average of the positive numbers: ") + avg),
                        () -> System.out.println("No numbers matching the condition were entered.")
                );
    }
}
