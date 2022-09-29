package SimpleCalculations;

import java.util.Scanner;

public class P12CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amounth = Double.parseDouble(scanner.nextLine());
        String currencyIn = scanner.nextLine().toUpperCase();
        String currencyOut = scanner.nextLine().toUpperCase();

        double usdToBgn = 1.79549;
        double eurToBgn = 1.95583;
        double gbpToBgn = 2.53405;
        double inToBgn = 0;

        if (currencyIn.equals("BGN")) {
            inToBgn = amounth;
        } else if (currencyIn.equals("USD")) {
            inToBgn = amounth * usdToBgn;
        } else if (currencyIn.equals("EUR")) {
            inToBgn = amounth * eurToBgn;
        } else if (currencyIn.equals("GBP")) {
            inToBgn = amounth * gbpToBgn;
        }
        if (currencyOut.equals("BGN")) {
            amounth = inToBgn;
        } else if (currencyOut.equals("USD")) {
            amounth = inToBgn / usdToBgn;
        } else if (currencyOut.equals("EUR")) {
            amounth = inToBgn / eurToBgn;
        } else if (currencyOut.equals("GBP")) {
            amounth = inToBgn / gbpToBgn;
        }
        System.out.printf("%.2f %s%n", amounth, currencyOut);
    }
}
