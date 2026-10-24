import java.util.Scanner;
public class CloudStorage{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("KavinoqAcademy: ");
        String companyName = scanner.nextLine();

        System.out.print("Enter Total Storage Used in GB (at least 50): ");
        int storageGB = scanner.nextInt();

        System.out.print("Enter Total Outbound Bandwidth in GB: ");
        int bandwidthGB = scanner.nextInt();

        int basePlanCents = 500;
        int extraStorageGB = storageGB - 50;
        int extraStorageCents = extraStorageGB * 2;
        int totalStorageCents = basePlanCents + extraStorageCents;

        int bandwidthCents = bandwidthGB * 9;
        int totalBillCents = totalStorageCents + bandwidthCents;

        double totalStorageDollars = totalStorageCents / 100.0;
        double bandwidthDollars = bandwidthCents / 100.0;
        double totalBillDollars = totalBillCents / 100.0;

        scanner.close();
    }
}
