package MoreExercisesConditionalStatementsAdvanced;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();

        if(budget < 10){
            System.out.println("Invalid number");
        }else if(budget <= 100){
            System.out.println("Economy class");
            if(season.equals("summer")){
                System.out.printf("Cabrio - %.2f%n",budget * 0.35);
            }else if(season.equals("winter")){
                System.out.printf("Jeep - %.2f%n",budget * 0.65);
            }
        }else if(budget <= 500){
            System.out.println("Compact class");
            if(season.equals("summer")){
                System.out.printf("Cabrio - %.2f%n",budget * 0.45);
            }else if(season.equals("winter")){
                System.out.printf("Jeep - %.2f%n",budget * 0.80);
            }
        }else if(budget > 500){
            System.out.println("Luxury class");
            System.out.printf("Jeep - %.2f%n",budget * 0.90);
        }else if(budget >=10000){
            System.out.println("Invalid number");
        }
    }
}
