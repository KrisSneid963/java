public class Main {

    public static void main(String[] args) {

        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        //larger than boolean
        System.out.println("Manhattan studio larger than Atlanta two-bedroom: "
                + manhattanStudioApt.largerThan(atlantaTwoBedroomApt));
        System.out.println("Bangor three-bedroom larger than Atlanta two-bedroom: "
                + bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));

        // price difference
        System.out.println("Price difference between Manhattan studio and Atlanta two-bedroom: "
                + manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));
        System.out.println("Price difference between Bangor three-bedroom and Atlanta two-bedroom: "
                + bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));

        //  which is more expensive  boolean
        System.out.println("Manhattan studio more expensive than Atlanta two-bedroom: "
                + manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));
        System.out.println("Bangor three-bedroom more expensive than Atlanta two-bedroom: "
                + bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));
    }
}
