public class DigitsSumCalculator {

    public void calculateSum(int number) {

        if (number < 1000 || number > 9999) {
            System.out.println("Please provide a four-digit number.");
            return;
        }

        // Extract digits and calculate their sum
        int thousands = number / 1000; //thousands digit
        int hundreds = (number / 100) % 10; // hundreds digit
        int tens = (number / 10) % 10; //  tens digit
        int ones = number % 10; //  ones digit

        int sum = thousands + hundreds + tens + ones;

        System.out.println("Sum of Digits: " + sum);
    }

    public static void main(String[] args) {
        DigitsSumCalculator calculator = new DigitsSumCalculator();

        calculator.calculateSum(1234);
    }
}