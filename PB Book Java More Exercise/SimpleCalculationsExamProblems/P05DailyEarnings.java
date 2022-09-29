package SimpleCalculationsExamProblems;

import java.util.Scanner;

public class P05DailyEarnings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workingDays = Integer.parseInt(scanner.nextLine());
        double moneyForDay = Double.parseDouble(scanner.nextLine());
        double UsdToBgn = Double.parseDouble(scanner.nextLine());

        double monthlySalary =  workingDays * moneyForDay;
        double yearInCome = monthlySalary * 12 + monthlySalary * 2.5;
        double tax = yearInCome * 0.25;
        double netSalary = yearInCome - tax;
        double salaryInLv = netSalary * UsdToBgn;
        double average = salaryInLv / 365;
        System.out.printf("%.2f", average);
    }
}
