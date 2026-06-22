public class BankDemo {

    public static void main(String[] args) {

        // Create 3 accounts
        BankAccount acc1 = new BankAccount("ACC101", "Nandini", 10000);
        BankAccount acc2 = new BankAccount("ACC102", "Rahul", 15000);
        BankAccount acc3 = new BankAccount("ACC103", "Priya", 20000);

        // 5 Transactions for Account 1
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.deposit(3000);
        acc1.withdraw(5000);
        acc1.withdraw(12000);

        // 5 Transactions for Account 2
        acc2.deposit(5000);
        acc2.withdraw(2000);
        acc2.deposit(1000);
        acc2.withdraw(7000);
        acc2.withdraw(15000);

        // 5 Transactions for Account 3
        acc3.deposit(4000);
        acc3.withdraw(3000);
        acc3.deposit(2000);
        acc3.withdraw(10000);
        acc3.withdraw(25000);

        // Print Statements
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        // Total Accounts Created
        System.out.println("\nTotal Accounts Created: "
                + BankAccount.getTotalAccounts());
    }
}