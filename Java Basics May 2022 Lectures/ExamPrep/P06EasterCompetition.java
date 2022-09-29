package ExamPrep;

import java.util.Scanner;

public class P06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreadCount = Integer.parseInt(scanner.nextLine());

        int maxPoints = Integer.MIN_VALUE;
        String winnerName = "";
        for (int i = 0; i < easterBreadCount; i++) {
            String name = scanner.nextLine();

            int totalPoints = 0;
            String input = scanner.nextLine();
            while (!input.equals("Stop")) {
                int currentPoint = Integer.parseInt(input);

                totalPoints += currentPoint;

                input = scanner.nextLine();
            }

            System.out.printf("%s has %d points.%n", name, totalPoints);

            if (totalPoints > maxPoints) {
                maxPoints = totalPoints;
                winnerName = name;
                System.out.printf("%s is the new number 1!%n", name);
            }
        }

        System.out.printf("%s won competition with %d points!%n", winnerName, maxPoints);
    }
}