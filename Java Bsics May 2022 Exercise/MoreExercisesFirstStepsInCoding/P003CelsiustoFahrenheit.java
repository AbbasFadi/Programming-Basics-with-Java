package MoreExercisesFirstStepsInCoding;

import java.util.Scanner;

public class P003CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Входни данни
        //- Celsius
        double celsius = Double.parseDouble(scanner.nextLine());

        //2. формула f = целзи * 9/5 + 32
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("%.2f", fahrenheit);
    }
}
