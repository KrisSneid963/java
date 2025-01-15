public class Debt {
    private double balance;
    private double interestRate;

    // Constructor
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    // print the current balance
    public void printBalance() {
        System.out.println(this.balance);
    }

    // grow the debt by one year
    public void waitOneYear() {
        this.balance = this.balance * this.interestRate;
    }
}
