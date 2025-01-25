public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super("Julius", id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < -overdraftLimit) {
            System.out.println("Checking Account: Withdrawal denied! Exceeds overdraft limit of $" + overdraftLimit);
            getTransactions().add(new Transaction('W', amount, getBalance(), "Failed withdrawal of $" + amount));
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "Checking Account Details:\n" +
                super.toString() +
                "\nOverdraft Limit: $" + overdraftLimit;
    }
}
