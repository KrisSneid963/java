public class PaymentCard {
    private double balance; // Instance variable to store the card's balance

    // Constructor to initialize the card's balance
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    // Method to add money to the card
    public void addMoney(double amount) {
        if (amount > 0) { // Only add positive amounts
            this.balance += amount;
        }
    }

    // Method to deduct money from the card
    public boolean takeMoney(double amount) {
        if (amount > 0 && this.balance >= amount) { // Only deduct if enough balance exists
            this.balance -= amount;
            return true; // Deduction successful
        }
        return false; // Not enough balance or invalid amount
    }

    // Method to return the current balance
    public double balance() {
        return this.balance;
    }

    // Method to return a string representation of the card's balance
    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
