public class Main {

    public static void main(String[] args) {
        PaymentTerminal terminal = new PaymentTerminal();
        PaymentCard card = new PaymentCard(5);

        System.out.println("\nBalance: " + terminal);
        System.out.println("Initial Card balance: " + card.balance());

        // Adding money to the card
        terminal.addMoneyToCard(card, 10);
        System.out.println("\nAfter adding 10 to card:");
        System.out.println("Terminal cash: " + terminal);
        System.out.println("Card balance: " + card.balance());

        // Buying meals with the card
        System.out.println("\nAttempting to buy affordable meal cc:");
        System.out.println("Transaction successful: " + terminal.eatAffordably(card));
        System.out.println("" + terminal);
        System.out.println("Card balance: " + card.balance());

        System.out.println("\nAttempting to buy hearty meal cc:");
        System.out.println("Transaction successful: " + terminal.eatHeartily(card));
        System.out.println("Terminal state: " + terminal);
        System.out.println("Card balance: " + card.balance());

        // Buying meals with cash
        System.out.println("\nAttempting to buy affordable meal cash (5.00):");
        System.out.println("Change returned: " + terminal.eatAffordably(5.00));
        System.out.println("Terminal state: " + terminal);

        System.out.println("\nAttempting to buy hearty meal with cash (3.00):");
        System.out.println("Change returned: " + terminal.eatHeartily(3.00));
        System.out.println("Terminal state: " + terminal);
    }
}
