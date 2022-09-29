package FirstStepsInCoding;

import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volumeCm = height * lenght * width;

        double volumeLiters = volumeCm * 0.001;
        double needLiters = volumeLiters * (1 - (percent / 100));
        System.out.println(needLiters);


    }
}