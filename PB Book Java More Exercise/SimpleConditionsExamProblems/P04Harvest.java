package SimpleConditionsExamProblems;

import java.util.Scanner;

public class P04Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1-ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000].
        //2-ри ред: Y грозде за един кв.м. – реално число в интервала [0.00 … 10.00].
        //3-ти ред: Z нужни литри вино – цяло число в интервала [1 … 600].
        //4-ти ред: брой работници – цяло число в интервала [1 … 20].

        int X = Integer.parseInt(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());
        int Z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double harvestPerVine = X * Y ;
        double wineLiters =(0.4 * harvestPerVine) / 2.5;

        if (wineLiters >= Z) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wineLiters));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineLiters - Z), Math.ceil((wineLiters - Z)/workers));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(Z - wineLiters));

        }


    }
}
