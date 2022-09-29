package SimpleConditionsExamProblems;

import java.util.Scanner;

public class P05Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double workDays = days * 0.9;
        double workHours = workDays * workers * (8+2);
        double hoursDif = Math.abs(neededHours - workHours);

        if (workHours >= neededHours) {
            System.out.printf("Yes!%.0f hours left.%n", Math.floor(hoursDif));
        } else {
            System.out.printf("Not enough time!%.0f hours needed.%n", Math.floor(hoursDif));
        }
    }
}
