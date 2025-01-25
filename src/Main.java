import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("Julius", 1122, 20000.0);
        account.setAnnualInterestRate(4.5);

        System.out.println("Balance: $" + account.getBalance());
        account.withdraw(2500.00);
        System.out.println("\nAfter withdrawing $2,500:");
        System.out.println("Balance: $" + account.getBalance());
        account.deposit(3000.00);
        System.out.println("\nAfter depositing $3,000:");
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("\nMonthly Interest Rate: $" + account.getMonthlyInterest());
        System.out.println("Account Created On: " + account.getDateCreated());
        System.out.println("\nAccount Details:\n" + account);


//        Scanner scanner = new Scanner(System.in);
//
//        SavingsAccount savings = new SavingsAccount(1001, 500.0);
//        savings.setAnnualInterestRate(4.5);
//
//        System.out.println("------------------------------------------------");
//        System.out.println("Savings Account:");
//        System.out.println(savings);
//
//        System.out.print("\nEnter amount You want to take from Savings Account: ");
//        double savingsWithdrawAmount = scanner.nextDouble();
//        savings.withdraw(savingsWithdrawAmount);
//        System.out.println("\nUpdated Savings Account :");
//        System.out.println(savings);
//
//        System.out.print("\nEnter amount You want to deposit into Savings Account: ");
//        double savingsDepositAmount = scanner.nextDouble();
//        savings.deposit(savingsDepositAmount);
//        System.out.println("\nUpdated Savings Account :");
//        System.out.println(savings);
//
//        CheckingAccount checking = new CheckingAccount(1003, 25000.0, 2000.0);
//        checking.setAnnualInterestRate(4.5);
//
//        System.out.println("------------------------------------------------");
//        System.out.println("Checking Account:");
//        System.out.println(checking);
//
//        System.out.print("\nEnter amount to withdraw: ");
//        double checkingWithdrawAmount = scanner.nextDouble();
//        checking.withdraw(checkingWithdrawAmount);
//        System.out.println("\nUpdated Checking Account :");
//        System.out.println(checking);
//
//        scanner.close();
//    }
//}
        System.out.println("------------------------------------------------");

        SavingsAccount savings = new SavingsAccount(1001, 500.0);
        savings.setAnnualInterestRate(4.5);
        savings.withdraw(600);
        System.out.println(savings);

        System.out.println("------------------------------------------------");

        CheckingAccount checking = new CheckingAccount(1003, 25000.0, 2000.0);
        checking.setAnnualInterestRate(4.5);
        System.out.println(checking);

        System.out.println("--------------------------------");

        System.out.println("\nTransactions for Main Account:");
        for (Transaction transaction : account.getTransactions()) {
            System.out.println(transaction);
        }

    }
}
