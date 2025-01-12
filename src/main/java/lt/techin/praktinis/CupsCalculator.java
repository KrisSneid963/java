public class CupsCalculator {

    public void calculateCups(int numberOfCups) {
        int cupsPerBox = 3;

        int fullBoxes = numberOfCups / cupsPerBox;

        int remainingCups = numberOfCups % cupsPerBox;

        System.out.println("Dėžių: " + fullBoxes);
        System.out.println("Liko puodelių: " + remainingCups);
    }

    public static void main(String[] args) {
        int numberOfCups = 10;
        CupsCalculator calculator = new CupsCalculator();
        calculator.calculateCups(numberOfCups);
    }
}
