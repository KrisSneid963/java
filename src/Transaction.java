import java.util.Date;

public class Transaction {
    private final Date date;
    private final char type;
    private final double amount;
    private final double balanceAfterTransaction;
    private final String description;

    public Transaction(char type, double amount, double balanceAfterTransaction, String description) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balanceAfterTransaction = balanceAfterTransaction;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Date: " + date +
                ", Type: " + type +
                ", Amount: $" + amount +
                ", Balance: $" + balanceAfterTransaction +
                ", Description: " + description;
    }
}
