package ConditionalStatements;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        int statCount = Integer.parseInt(scanner.nextLine());
        double priceClothesOneStat = Double.parseDouble(scanner.nextLine());

        double decor = movieBudget * 0.10;
        double allPriceClothes = priceClothesOneStat * statCount;


        if (statCount >= 150) {
            allPriceClothes = allPriceClothes - (allPriceClothes * 0.10);
        }
        double totalSum = allPriceClothes + decor;
        if (totalSum > movieBudget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalSum - movieBudget);

        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", movieBudget - totalSum);
        }



    }
}
