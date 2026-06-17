class InsufficientBalanceException extends Exception {

    private double balance;
    private double requestedAmount;

    public InsufficientBalanceException(
            String message,
            double balance,
            double requestedAmount) {

        super(message);
        this.balance = balance;
        this.requestedAmount = requestedAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }
}

class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient Balance!",
                    balance,
                    amount
            );
        }

        balance -= amount;
        System.out.println(
                "Withdrawal successful. Remaining Balance: ₹" + balance);
    }
}

public class ATMWithdrawalSystem {

    public static void main(String[] args) {

        Account account = new Account(5000);

        try {
            account.withdraw(8000);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
            System.out.println("Available Balance: ₹" + e.getBalance());
            System.out.println("Requested Amount: ₹" + e.getRequestedAmount());
        }
    }
}