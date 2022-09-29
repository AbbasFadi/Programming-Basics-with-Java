package SimpleCalculationsExamProblems;

import java.util.Scanner;

public class P03ChangeTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //N – дължината на страна от площадката в интервала [1 … 100].
        //W – широчината на една плочка в интервала [0.1 … 10.00].
        //L – дължината на една плочка в интервала [0.1 … 10.00].
        //М – широчината на пейката в интервала [0 … 10].
        //О – дължината на пейката в интервала [0 … 10].
        int N = Integer.parseInt(scanner.nextLine());
        double W = Double.parseDouble(scanner.nextLine());
        double L = Double.parseDouble(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int O = Integer.parseInt(scanner.nextLine());

        double total = N * N;
        double totalBench = M * O;
        double spaceCover = total - totalBench;
        double tiles = W * L;
        double neededTiles = spaceCover / tiles;
        double neededTime = neededTiles * 0.2;
        System.out.println(neededTiles);
        System.out.println(neededTime);
    }
}
