import java.util.Scanner;

public class ConverterMileToKilometre {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles: ");
        double miles = input.nextDouble();

        double kilometres = miles * 1.6;
        System.out.println(miles + " miles is " + kilometres + "kilometres");

    }
}