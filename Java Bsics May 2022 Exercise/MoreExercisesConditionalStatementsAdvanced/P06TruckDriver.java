package MoreExercisesConditionalStatementsAdvanced;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double distance = Double.parseDouble(scanner.nextLine());

        double salary = 0;

        if (distance > 10000 && distance <= 20000) {
            salary = distance * 1.45;
        } else if (distance > 5000 && distance <= 10000) {
            if (season.equals("Winter")) {
                salary = distance * 1.25;
            } else if (season.equals("Summer")) {
                salary = distance * 1.10;
            } else {
                salary = distance * 0.95;
            }
        } else {
            if (season.equals("Winter")) {
                salary = distance * 1.05;
            } else if (season.equals("Summer")) {
                salary = distance * 0.90;
            } else {
                salary = distance * 0.75;
            }
        }

        salary = salary * 4 * 0.9;

        System.out.printf("%.2f", salary);
    }
}
