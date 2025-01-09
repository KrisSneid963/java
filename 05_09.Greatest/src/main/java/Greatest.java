public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        // Compare the three numbers and return the greatest one
        if (number1 >= number2 && number1 >= number3) {
            return number1;
        } else if (number2 >= number1 && number2 >= number3) {
            return number2;
        } else {
            return number3;
        }
    }

    public static void main(String[] args) {
        // Call the greatest method and print the result
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
