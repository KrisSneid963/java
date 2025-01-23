import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class AverageOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers, type \"end\" to stop:");

        List<Double> numbers = scanner.tokens()
                .takeWhile(input -> !input.equalsIgnoreCase("end"))
                .map(Double::parseDouble) // Parse input into Double
                .toList();


        double average = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(Double.NaN);

      
        System.out.println("average of the numbers: " + average);
    }
}
