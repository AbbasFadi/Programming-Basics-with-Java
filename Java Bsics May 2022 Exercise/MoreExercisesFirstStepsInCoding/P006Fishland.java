package MoreExercisesFirstStepsInCoding;

import java.util.Scanner;

public class P006Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Входни данни
        //- priceSkym
        double priceSkym = Double.parseDouble(scanner.nextLine());
        //- priceCaca
        double priceCaca = Double.parseDouble(scanner.nextLine());
        //- kgPalam
        double kgPalam = Double.parseDouble(scanner.nextLine());
        //- kgSafr
        double kgSafr = Double.parseDouble(scanner.nextLine());
        //- kgMidi
        int kgMidi = Integer.parseInt(scanner.nextLine());

        //2.  pricePalam = priceSkym + priceSkym * 0.60
        double pricePalam = priceSkym + priceSkym * 0.60;
        //3. allPalam = kgPalam  * pricePalam
        double allPalam = kgPalam * pricePalam;
        //4. priceSafr = priceCaca + priceCaca * 0.80
        double priceSafr = priceCaca + priceCaca * 0.80;
        //5. allSafr = kgSafr * priceSafr
        double allSafr = kgSafr * priceSafr;
        //6. allMidi = 1 * 7.50
        double allMidi = kgMidi * 7.50;
        //7. totalPrice = allPalam + allSafr + allMidi
        double totalPrice = allPalam + allSafr + allMidi;

        System.out.printf("%.2f", totalPrice );
    }
}
