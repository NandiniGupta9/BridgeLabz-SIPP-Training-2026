import java.util.ArrayList;

public class BankAccount {

    private String accountNumber;
    private String holder;
    private double balance;

    private ArrayList<String> transactions;

    // Static field to track total accounts
    private static int totalAccounts = 0;

    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        this.transactions = new ArrayList<>();

        totalAccounts++;
        transactions.add("Account opened with balance ₹" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add("Withdrawn ₹" + amount);
        } else {
            transactions.add("Failed Withdrawal ₹" + amount +
                    " (Insufficient Balance)");
            System.out.println("Insufficient Balance in Account: " + accountNumber);
        }
    }

    public void getStatement() {
        System.out.println("\n==================================");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + holder);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("Transaction History:");

        for (String transaction : transactions) {
            System.out.println(" - " + transaction);
        }

        System.out.println("==================================");
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
