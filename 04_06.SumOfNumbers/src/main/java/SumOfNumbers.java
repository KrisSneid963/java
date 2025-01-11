import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Variable to store the sum of the numbers

        while (true) {
            System.out.print("Give a number: ");
            int number = scanner.nextInt();

            if (number == 0) {
                break; // Exit the loop if the user enters 0
            }

            sum += number; // Add the number to the sum
        }

        // Print the total sum of the numbers
        System.out.println("Sum of the numbers: " + sum);
    }
}
