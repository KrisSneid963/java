import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.print("Give a number: ");
            int number = scanner.nextInt();

            if (number == 0) {
                break; //if 0 exit
            }
            count++; // counting each number
        }
        System.out.println("Number of numbers: " + count);
    }
}
