package MoreExercisesForLoop;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double totalPoints = 0;

        int tillNine = 0;
        int tillNineteen = 0;
        int tillTwentyNine = 0;
        int tillThirtyNine = 0;
        int tillFifty = 0;
        int invalids = 0;


        for (int i = 1; i <=n; i++){
            int currentNumber = Integer.parseInt(scanner.nextLine());
            boolean invalid = currentNumber<0 || currentNumber>50;

            if (currentNumber<=9 && !invalid){
                totalPoints = totalPoints+ currentNumber*0.2;
                tillNine++;

            } else if (currentNumber <=19 && !invalid){
                totalPoints = totalPoints + currentNumber*0.3;
                tillNineteen++;

            } else if (currentNumber<=29 && !invalid) {
                totalPoints = totalPoints + currentNumber*0.4;
                tillTwentyNine++;

            } else if (currentNumber <=39 && !invalid) {
                totalPoints = 50 + totalPoints;
                tillThirtyNine++;

            }else if (currentNumber <=50 && !invalid) {
                totalPoints = totalPoints + 100;
                tillFifty++;

            }else if (invalid){
                totalPoints = totalPoints/2;
                invalids++;
            }
        }

        System.out.printf("%.2f%n", totalPoints);
        System.out.printf("From 0 to 9: %.2f%%%n", (tillNine*1.0/n)*100);
        System.out.printf("From 10 to 19: %.2f%%%n", (tillNineteen*1.0/n)*100);
        System.out.printf("From 20 to 29: %.2f%%%n", (tillTwentyNine*1.0/n)*100);
        System.out.printf("From 30 to 39: %.2f%%%n", (tillThirtyNine*1.0/n)*100);
        System.out.printf("From 40 to 50: %.2f%%%n", (tillFifty*1.0/n)*100);
        System.out.printf("Invalid numbers: %.2f%%%n", (invalids*1.0/n)*100);
    }
}