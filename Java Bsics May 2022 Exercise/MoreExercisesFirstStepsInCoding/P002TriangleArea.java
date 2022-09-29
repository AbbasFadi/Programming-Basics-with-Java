package MoreExercisesFirstStepsInCoding;

import java.util.Scanner;

public class P002TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Входни данни
        //- a страна
        double a = Double.parseDouble(scanner.nextLine());
        //- h височина
        double h = Double.parseDouble(scanner.nextLine());
        //2. формула area = а * h / 2
        double area = a * h / 2;
        //3. да се форм. до втория знак
        System.out.printf("%.2f", area);
    }
}
