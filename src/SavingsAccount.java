public class SavingsAccount extends Account {

    public SavingsAccount(int id, double balance) {
        super("Julius", id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            getTransactions().add(new Transaction('W', amount, getBalance(), "Failed withdrawal of $" + amount));
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "Savings Account Details:\n" +
                super.toString() +
                "\nNote: Savings accounts cannot be overdrawn.";
    }
}
