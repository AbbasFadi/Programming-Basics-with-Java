package SimpleConditionsExamProblems;

import java.util.Scanner;

public class P02PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double water = p1*hours + p2*hours;

        if (water<=v){
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.",
                    Math.floor(water/v*100),
                    Math.floor(p1*hours/water*100),
                    Math.floor(p2*hours/water*100));
        }else {
            System.out.printf("For %f hours the pool overflows with %f liters.", hours, water - v);
        }
    }
}
