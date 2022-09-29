package MoreExercisesForLoop;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double electricityMonthly = 0;
        int waterMonthly = 20;
        int internetMonthly = 15;
        double otherMonthly = (electricityMonthly + waterMonthly + internetMonthly) * 1.2;

        double electricityTotal = 0;
        double waterTotal = 0;
        double internetTotal = 0;
        double othersTotal = 0;
        double allTotal = 0;

        for (int i = 1; i <= months; i++) {
            electricityMonthly = Double.parseDouble(scanner.nextLine());
            electricityTotal += electricityMonthly;
            otherMonthly =  1.2 * (electricityMonthly + waterMonthly + internetMonthly);
            othersTotal += otherMonthly;

        }
        waterTotal = waterMonthly * months;
        internetTotal = internetMonthly * months;
        allTotal = electricityTotal + waterTotal + internetTotal + othersTotal;

        System.out.printf("Electricity: %.2f lv%n", electricityTotal);
        System.out.printf("Water: %.2f lv%n", waterTotal);
        System.out.printf("Internet: %.2f lv%n", internetTotal);
        System.out.printf("Other: %.2f lv%n", othersTotal);
        System.out.printf("Average: %.2f lv", allTotal / months);
    }
}
