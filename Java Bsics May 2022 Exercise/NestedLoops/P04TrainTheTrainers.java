package NestedLoops;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int countAllGrades = 0;
        double allGradesSum = 0;
        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            String presentation = command;

            double sumCurrentGrades = 0;
            for (int i = 1; i <= n; i++) {//колкото е  журито, толкова оценки трябва да прочета
                double currentGrade = Double.parseDouble(scanner.nextLine());//прочитам оценка за презентацията
                countAllGrades++;
                sumCurrentGrades = sumCurrentGrades + currentGrade;
            }
            allGradesSum = allGradesSum + sumCurrentGrades;
            double avgCurrentGrade = sumCurrentGrades / n;//намирам средната оценка за текуща презентация

            System.out.printf("%s - %.2f.%n", presentation, avgCurrentGrade);// презентацията - средната оценка на презентацията
            command = scanner.nextLine();
        }
        double finalGrade = allGradesSum / countAllGrades;
        System.out.printf("Student's final assessment is %.2f.", finalGrade);
    }
}
