package MoreExercisesConditionalStatementsAdvanced;

import java.util.Scanner;

public class P10MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x;

        for (int i = 1; i >0; i++) {
            x = Double.parseDouble(scanner.nextLine());
            if (x>=0){
                System.out.printf("Result: %.2f", x*2);
                System.out.println(" ");


            } else {
                System.out.println("Negative number!");
                break;

            }
        }
    }
}