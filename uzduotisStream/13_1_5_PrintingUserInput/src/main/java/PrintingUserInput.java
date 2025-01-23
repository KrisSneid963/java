import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class PrintingUserInput {
    public static void main(String[] args) {

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        System.out.println("Enter information, then press double Enter: ");

        Stream.generate(scanner::nextLine)
                .takeWhile(input -> !input.isEmpty())
                .forEach(inputs::add); // Add inputs to the list
        
        System.out.println(" Your entered information: ");

        System.out.println();
        inputs.forEach(System.out::println);
    }
}
