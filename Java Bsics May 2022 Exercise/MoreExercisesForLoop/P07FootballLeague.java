package MoreExercisesForLoop;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int fansCount = Integer.parseInt(scanner.nextLine());

        int aCounter = 0;
        int bCounter = 0;
        int vCounter = 0;
        int gCounter = 0;

        for (int i = 1; i <= fansCount; i++) {
            String sector = scanner.nextLine();

            switch (sector) {
                case "A": {
                    aCounter++;
                    break;
                }
                case "B": {
                    bCounter++;
                    break;
                }
                case "V": {
                    vCounter++;
                    break;
                }
                case "G": {
                    gCounter++;
                    break;
                }
            }
        }

        double aFansPercent = aCounter * 1.0 / fansCount * 100;
        double bFansPercent = bCounter * 1.0 / fansCount * 100;
        double vFansPercent = vCounter * 1.0 / fansCount * 100;
        double gFansPercent = gCounter * 1.0 / fansCount * 100;
        double allFansPercent = fansCount * 1.0 / stadiumCapacity * 100;

        System.out.printf("%.2f%%%n" +
                        "%.2f%%%n" +
                        "%.2f%%%n" +
                        "%.2f%%%n" +
                        "%.2f%%%n",
                aFansPercent, bFansPercent, vFansPercent, gFansPercent, allFansPercent);
    }
}
