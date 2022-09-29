package MoreExercisesConditionalStatements;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());
        int workingDays = 365 - daysOff;
        int min = (workingDays * 63) + (daysOff * 127);
        int diff = Math.abs(30000 - min);
        int h = diff / 60;
        double m = diff % 60;



            if (30000 > min) {
                System.out.println("Tom sleeps well");
                System.out.printf("%d hours and %.0f minutes less for play", h, m);
            } else {
                System.out.println("Tom will run away");
                System.out.printf("%d hours and %.0f minutes more for play", h, m);
            }
        }
}