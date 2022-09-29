package FirstStepsInCoding;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        int depositTime = Integer.parseInt(scanner.nextLine());
        double year = Double. parseDouble(scanner.nextLine());

        double interest = sum * year / 100;
        double monthInterest = interest / 12;
        double totalPrice = sum + depositTime * monthInterest;
        System.out.println(totalPrice);
    }
}
