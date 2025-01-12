public class NumberReverter {
    public void revert(int number) {

        if (number < 100 || number > 999) {
            System.out.println("Please provide a three-digit number.");
            return;
        }

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        int reversedNumber = ones * 100 + tens * 10 + hundreds;


        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static void main(String[] args) {
        NumberReverter reverter = new NumberReverter();


        reverter.revert(489); // Expected output: 984
    }
}
