package MoreExercisesConditionalStatements;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int vineArea = Integer.parseInt(scanner.nextLine());
        double squareMeterGrape = Double.parseDouble(scanner.nextLine());
        int neededLitersWine = Integer.parseInt(scanner.nextLine());
        int farmers = Integer.parseInt(scanner.nextLine());

        double totalGrape = vineArea * squareMeterGrape;
        double wine = 0.4 * totalGrape / 2.5;


        if (wine >= neededLitersWine) {
            double extraWine = Math.abs(wine - neededLitersWine);
            double winePerPerson = extraWine / farmers;

            System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(wine));
            System.out.println();
            System.out.printf("%.0f liters left -> %.0f liters per person.",
                    Math.ceil(extraWine), Math.ceil(winePerPerson));

        } else if (wine < neededLitersWine) {
            double wineShortage = neededLitersWine - wine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineShortage));

        }
    }
}
