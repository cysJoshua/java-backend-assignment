import java.util.Scanner;

public class NewlancerPayout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Freelancer Name: ");
        String freelancerName = input.nextLine();

        System.out.print("Invoice Amount in USD Cents: ");
        long invoiceAmount = input.nextLong();

        System.out.print("Withholding Tax Percentage: ");
        int taxPercentage = input.nextInt();

        System.out.print("Exchange Rate (Local Units per 1 USD): ");
        long exchangeRate = input.nextLong();

        long taxAmount = (invoiceAmount * taxPercentage) / 100;
        long afterTax = invoiceAmount - taxAmount;

    }
}