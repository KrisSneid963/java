
public class MainProgram {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!


        PaymentCard card = new PaymentCard(10);

        // initial balance
        System.out.println(card);

        // Add 5
        card.addMoney(5);
        System.out.println(card);

        // - 8 euros
        boolean success = card.takeMoney(8);
        System.out.println("Payment success: " + success);
        System.out.println(card);

        // - 10 euros
        success = card.takeMoney(10);
        System.out.println("Payment success: " + success); //false because out of limit
        System.out.println(card);
    }
}



