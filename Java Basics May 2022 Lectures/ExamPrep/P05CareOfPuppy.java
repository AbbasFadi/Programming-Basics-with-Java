package ExamPrep;

import java.util.Scanner;

public class P05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int availableFoodKg = Integer.parseInt(scanner.nextLine());
        int allAvailableFoodGr = availableFoodKg * 1000;
        int allEatenFood = 0;
        String input = scanner.nextLine();
        while (!input.equals("Adopted")) {
            int currentFood = Integer.parseInt(input);
            allEatenFood += currentFood;


            input = scanner.nextLine();
        }

        int diff = Math.abs(allEatenFood - allAvailableFoodGr);
        if (allEatenFood <= allAvailableFoodGr) {
            System.out.printf("Food is enough! Leftovers: %d grams.", diff);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", diff);
        }
    }
}
