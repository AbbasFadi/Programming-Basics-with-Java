package MoreExercisesConditionalStatements;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първият ред съдържа числото V – Обем на басейна в литри – цяло число в интервала [1…10000].
        int V = Integer.parseInt(scanner.nextLine());
        //•	Вторият ред съдържа числото P1 – дебит на първата тръба за час – цяло число в интервала [1…5000].
        int P1 = Integer.parseInt(scanner.nextLine());
        //•	Третият ред съдържа числото P2 – дебит на втората тръба за час– цяло число в интервала [1…5000].
        int P2 = Integer.parseInt(scanner.nextLine());
        //•	Четвъртият ред съдържа числото H – часовете които работникът отсъства – реално число в интервала [1.0…24.00]
        double H = Double.parseDouble(scanner.nextLine());

        double totalBothPipes = (P1 + P2) * H;

        if (V >= totalBothPipes){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
                    (totalBothPipes * 100 / V), (P1 * H * 100 / totalBothPipes), (P2 * H * 100 / totalBothPipes));
        }else{
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, (totalBothPipes - V));
        }
    }
}