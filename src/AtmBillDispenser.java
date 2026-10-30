import java.util.Scanner;

public class AtmBillDispenser {
    public static void main(String[] academichub) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Withdrawal amount in whole dollars: ");
        int amount = scanner.nextInt();

        int remainingAmount = amount;

        int bills100 = remainingAmount / 100;
        remainingAmount %= 100;

        int bills50 = remainingAmount / 50;
        remainingAmount %= 50;

        int bills20 = remainingAmount / 20;
        remainingAmount %= 20;

        int bills10 = remainingAmount / 10;
        remainingAmount %= 10;

        int bills5 = remainingAmount / 5;
        remainingAmount %= 5;

        int bills1 = remainingAmount;

        int totalBills = bills100 + bills50 + bills20 + bills10 + bills5 + bills1;

        System.out.println("$100 bills: " + bills100);
        System.out.println("$50 bills: " + bills50);
        System.out.println("$20 bills: " + bills20);
        System.out.println("$10 bills: " + bills10);
        System.out.println("$5 bills: " + bills5);
        System.out.println("$1 bills: " + bills1);
        System.out.println("Total physical bills dispensed: " + totalBills);

        scanner.close();
    }
}