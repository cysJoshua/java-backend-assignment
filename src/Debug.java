public class Debug {
}
void main() {
    IO.println("=== Airport FX Booth ===");

    String customer = IO.readln("Customer name: ");
    int usdDollars = Integer.parseInt(IO.readln("USD Dollars to exchange (e.g. 200): "));

    int commissionPercent = 3;
    int commissionDollars = (usdDollars * commissionPercent) / 100;

    int flatFee = 2;
    IO.println("Total Fee: $" + (commissionDollars + flatFee));

    int netUsd = usdDollars - (commissionDollars + flatFee);

    IO.println("Customer " + customer + " receives exchange on: $" + netUsd);
}
