import java.util.Scanner;
public class Untimer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter server uptime in total seconds: ");
        long totalSeconds = scanner.nextLong();

        long days = totalSeconds / 86_400;
        long remainingSeconds = totalSeconds % 86_400;

        long hours = remainingSeconds / 3_600;
        remainingSeconds = remainingSeconds % 3_600;

        long minutes = remainingSeconds / 60;
        long seconds = remainingSeconds % 60;

        System.out.println("\n--- Uptime Breakdown ---");
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

        scanner.close();
    }
}