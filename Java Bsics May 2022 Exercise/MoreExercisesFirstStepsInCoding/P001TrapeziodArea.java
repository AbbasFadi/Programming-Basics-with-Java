package MoreExercisesFirstStepsInCoding;

import java.util.Scanner;

public class P001TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Входни данни
        //- double b1 основа
        double b1 = Double.parseDouble(scanner.nextLine());
        //- double b2 основа
        double b2 = Double.parseDouble(scanner.nextLine());
        //-double h височина
        double h = Double.parseDouble(scanner.nextLine());

        //формула за лице (b1 + b2) * h / 2
        double area = (b1 + b2) * h / 2;
        System.out.printf("%.2f", area);
    }
}
