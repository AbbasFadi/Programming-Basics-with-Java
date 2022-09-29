package ConditionalStatements;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = videoCard * 250;
        double processorsPrice = videoCardPrice * 0.35 * processors;
        double ramPrice = videoCardPrice * 0.10 * ram;

        double totalSum = videoCardPrice + processorsPrice + ramPrice;

        if (videoCard > processors) {
            totalSum = totalSum - (totalSum * 0.15);
        }
        if (totalSum <= budget) {
            System.out.printf("You have %.2f leva left!", budget - totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalSum - budget);
        }


    }
}
