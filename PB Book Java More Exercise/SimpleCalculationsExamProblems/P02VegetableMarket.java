package SimpleCalculationsExamProblems;

import java.util.Scanner;

public class P02VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceKiloVeg = Double.parseDouble(scanner.nextLine());
        double priceKiloFru = Double.parseDouble(scanner.nextLine());
        double totalKiloVeg = Double.parseDouble(scanner.nextLine());
        double totalKiloFru = Double.parseDouble(scanner.nextLine());

        double totalPriceVeg = priceKiloVeg * totalKiloVeg;
        double totalPriceFru = priceKiloFru * totalKiloFru;
        double allInBGN = totalPriceVeg + totalPriceFru;

        double allInEuro = allInBGN / 1.94;
        System.out.println(allInEuro);
    }
}
