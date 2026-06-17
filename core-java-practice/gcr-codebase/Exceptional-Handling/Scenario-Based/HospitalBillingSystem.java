import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void processPayment(double balance, double amount)
            throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds."
            );
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // NumberFormatException
            System.out.print("Enter bill amount: ");
            String input = sc.nextLine();
            double bill = Double.parseDouble(input);

            // ArrayIndexOutOfBoundsException
            String[] patients = {"Amit", "Riya", "Rahul"};

            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient: " + patients[index]);

            // ArithmeticException
            System.out.print("Enter number of items: ");
            int items = Integer.parseInt(sc.nextLine());

            double costPerItem = bill / items;
            System.out.println("Cost per item: " + costPerItem);

            // Custom Exception
            processPayment(5000, bill);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index!");

        } catch (ArithmeticException e) {
            System.out.println("Bill cannot be divided by zero items!");

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}