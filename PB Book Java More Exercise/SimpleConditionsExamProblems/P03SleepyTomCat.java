package SimpleConditionsExamProblems;

import java.util.Scanner;

public class P03SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int breakDays = Integer.parseInt(scanner.nextLine());
        int norma = 30000;
        int workDays = 365 - breakDays;
        int timePlay = workDays * 63 + breakDays * 127;
        int mins = Math.abs(norma - timePlay) % 60;
        int hours = Math.abs(norma - timePlay) / 60;
        if (timePlay >= norma) {
            System.out.println("Tom will run away");
            System.out.printf("%s hours and %s minutes more for play", hours, mins);

        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%s hours and %s minutes less for play", hours, mins);

        }

    }
}
