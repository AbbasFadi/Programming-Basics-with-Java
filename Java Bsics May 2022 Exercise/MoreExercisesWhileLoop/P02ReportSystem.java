package MoreExercisesWhileLoop;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumEnd = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int counter = 0;
        int averageCS = 0;
        int averageCC = 0;
        int counterCS = 0;
        int counterCC = 0;
        int total = 0;
        boolean isOK = false;

        while (!input.equals("End")) {
            counter++;
            int price = Integer.parseInt(input);

            if (counter % 2 == 0) {        // плащане с карта
                if (price < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    averageCC = averageCC + price;
                    total = total + price;
                    counterCC++;
                }
            } else {                     // плащане в брой
                if (price > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    averageCS = averageCS + price;
                    total = total + price;
                    counterCS++;
                }
            }
            if (total >= sumEnd) {
                isOK = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (isOK) {
            System.out.printf("Average CS: %.2f\n", 1.0 * averageCS / counterCS);
            System.out.printf("Average CC: %.2f", 1.0 * averageCC / counterCC);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}
