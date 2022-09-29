package MoreExercisesFirstStepsInCoding;

import java.util.Scanner;

public class P007HousePainting {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double x = Double.parseDouble(sc.nextLine()); //височина
        double y = Double.parseDouble(sc.nextLine()); //lenght
        double h = Double.parseDouble(sc.nextLine()); //height roof

        double a = x * x; //malka stena
        double b = y * x; //golyama stena
        double c = x * h / 2; //triagalna stena
        double d = y * x; //pokriv

        double clearA = a + a - 1.2 * 2;
        double clearB = (b - 2.25) * 2;
        double clearC = c * 2;
        double clearD = d * 2;

        double greenPaint = (clearA + clearB) / 3.4;
        double redPaint = (clearC + clearD) / 4.3;


// закръгля до 2 знака
        System.out.println(String.format("%.2f",greenPaint));
        System.out.println(String.format("%.2f",redPaint));

    }
}