
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("First number? ");
        int firstNumber = scanner.nextInt();

        System.out.println("Last number? ");
        int lastNumber = scanner.nextInt();

        int sum = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);

        scanner.close();
    }
}


//or if we want to add 5+5 and other same numbers
//if (firstNumber == lastNumber) {
//sum = firstNumber + lastNumber;
//} else {
//        for (int i = firstNumber; i <= lastNumber; i++) {
//sum += i;
//    }
//            }
//System.out.println("The sum is " + sum);