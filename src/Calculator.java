import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n");
            System.out.println("Select an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Find Maximum");
            System.out.println("6. Find Minimum");
            System.out.println("7. Exit");

            //adding
            System.out.print("Enter your choice (1-7): ");
            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Exiting the calculator. Goodbye!");
                running = false;
                continue;
            }

            // Input two numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Perform the chosen operation
            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;

                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.println("Maximum: " + Math.max(num1, num2));
                    break;
                case 6:
                    System.out.println("Minimum: " + Math.min(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 7.");
            }
        }

        scanner.close();
    }
}
