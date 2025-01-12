import java.util.Scanner; //if no user dont add scanner

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius) {
        double temperatureFahrenheit = (temperatureCelsius * 9.0 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + temperatureFahrenheit);
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        Scanner scanner = new Scanner(System.in); //if no user dont write here this line

        //user
        System.out.println("Please enter temperature in Celsius: "); //if no user enter 25 here
        int temperatureCelsius = scanner.nextInt();


        converter.toFahrenheit(temperatureCelsius);
    }
}