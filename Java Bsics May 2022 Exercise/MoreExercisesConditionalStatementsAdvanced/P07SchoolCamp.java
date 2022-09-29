package MoreExercisesConditionalStatementsAdvanced;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String typeGroup = scanner.nextLine();
        int sumStudant = Integer.parseInt(scanner.nextLine());
        int sumNight = Integer.parseInt(scanner.nextLine());

        double priceNight = 0;
        double discount = 0;
        String sport = " ";

        if (typeGroup.equals("boys")) {
            if (season.equals("Winter")) {
                priceNight = sumNight * sumStudant * 9.60;
                sport = "Judo";
            } else if (season.equals("Spring")) {
                priceNight = sumNight * sumStudant * 7.20;
                sport = "Tennis";
            } else if (season.equals("Summer")) {
                priceNight = sumNight * sumStudant * 15;
                sport = "Football";
            }
        } else if (typeGroup.equals("girls")) {
            if (season.equals("Winter")) {
                priceNight = sumNight * sumStudant * 9.60;
                sport = "Gymnastics";
            } else if (season.equals("Spring")) {
                priceNight = sumNight * sumStudant * 7.20;
                sport = "Athletics";
            } else if (season.equals("Summer")) {
                priceNight = sumNight * sumStudant * 15;
                sport = "Volleyball";
            }
        } else if (typeGroup.equals("mixed")) {
            if (season.equals("Winter")) {
                priceNight = sumNight * sumStudant * 10;
                sport = "Ski";
            } else if (season.equals("Spring")) {
                priceNight = sumNight * sumStudant * 9.50;
                sport = "Cycling";
            } else if (season.equals("Summer")) {
                priceNight = sumNight * sumStudant * 20;
                sport = "Swimming";
            }

        }
        if (sumStudant >= 10 && sumStudant < 20) {
            discount = priceNight * 0.05;
        } else if (sumStudant >= 20 && sumStudant < 50) {
            discount = priceNight * 0.15;
        } else if (sumStudant >= 50) {
            discount = priceNight * 0.50;
        }

        double totalPriceNight = priceNight - discount;
        System.out.printf("%s %.2f lv.", sport, totalPriceNight);

    }
}
