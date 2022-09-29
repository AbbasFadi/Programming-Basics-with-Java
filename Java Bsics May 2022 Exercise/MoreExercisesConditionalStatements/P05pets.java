package MoreExercisesConditionalStatements;

import java.util.Scanner;

public class P05pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countDays = Integer.parseInt(scanner.nextLine());
        int foodKg = Integer.parseInt(scanner.nextLine());
        double dogFoodKg = Double.parseDouble(scanner.nextLine());
        double catFoodKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodGrams = Double.parseDouble(scanner.nextLine());

        double needFoodDog = countDays * dogFoodKg;
        double needFoodCat = countDays * catFoodKg;
        double needFoodTurtle = (countDays * turtleFoodGrams) / 1000;

        double totalFoodNeed = needFoodCat + needFoodTurtle + needFoodDog;

        if (foodKg >= totalFoodNeed) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodKg - totalFoodNeed));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFoodNeed - foodKg));
        }

    }
}
