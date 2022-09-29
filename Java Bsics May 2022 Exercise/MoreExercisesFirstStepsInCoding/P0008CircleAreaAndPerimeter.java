package MoreExercisesFirstStepsInCoding;

import java.util.Scanner;

public class P0008CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double perimeter = 2 * Math.PI * number;
        double number2 = Math.pow(number, 2);
        double calculatingArea = Math.PI * number2;
        System.out.printf("%.2f", calculatingArea);
        System.out.println();
        System.out.printf("%.2f", perimeter);

    }
}
