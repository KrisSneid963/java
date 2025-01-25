import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private final int id;
    private final String name;
    private double balance;
    private double annualInterestRate;
    private final Date dateCreated;
    private final List<Transaction> transactions;


    public Account(String name) {
        this.name = name;
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
        this.transactions = new ArrayList<>();
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
        this.transactions = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }


    public double getMonthlyInterest() {
        return (annualInterestRate / 12) / 100 * balance;
    }


    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "Deposit of $" + amount));
    }


    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            transactions.add(new Transaction('W', amount, balance, "Failed withdrawal $" + amount));
        } else {
            balance -= amount;
            transactions.add(new Transaction('W', amount, balance, "Withdrawal $" + amount));
        }
    }

    @Override
    public String toString() {
        return "Account ID: " + id +
                "\nName: " + name +
                "\nBalance: $" + balance +
                "\nAnnual Interest Rate: " + annualInterestRate + "%" +
                "\nDate Created: " + dateCreated;
    }
}
