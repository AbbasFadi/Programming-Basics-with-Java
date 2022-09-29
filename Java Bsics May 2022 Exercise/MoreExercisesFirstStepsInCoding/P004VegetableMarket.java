package MoreExercisesFirstStepsInCoding;

import java.util.Scanner;

public class P004VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//1. Входни данни
//- double priceVegetables
        double priceVegetables = Double.parseDouble(scanner.nextLine());

//- double priceFruits
        double priceFruits = Double.parseDouble(scanner.nextLine());
//- int kiloVegetables
        int kiloVegetables = Integer.parseInt(scanner.nextLine());
//- int kiloFruits
        int kiloFruits = Integer.parseInt(scanner.nextLine());
        double allBGN =((priceVegetables * kiloVegetables) + (priceFruits * kiloFruits)) / 1.94;

        System.out.printf("%.2f", allBGN);


    }
}
