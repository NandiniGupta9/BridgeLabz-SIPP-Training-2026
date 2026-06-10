import java.util.Scanner;

public class KingdomTaxSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] incomes = new double[10];
        double totalTax = 0;

        // Input incomes
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter income of Citizen " + (i + 1) + ": ");
            incomes[i] = sc.nextDouble();
        }

        System.out.println("\n--- Tax Report ---");

        // Calculate tax for each citizen
        for (int i = 0; i < 10; i++) {
            double income = incomes[i];
            double tax;
            String bracket;

            if (income < 10000) {
                tax = income * 0.05;
                bracket = "5% Tax Bracket";
            } else if (income <= 50000) {
                tax = income * 0.15;
                bracket = "15% Tax Bracket";
            } else {
                tax = income * 0.30;
                bracket = "30% Tax Bracket";
            }

            totalTax += tax;

            System.out.println("Citizen " + (i + 1) +
                    " | Income: ₹" + income +
                    " | Bracket: " + bracket +
                    " | Tax: ₹" + tax);
        }

        System.out.println("\nTotal Tax Collected: ₹" + totalTax);

        sc.close();
    }
}