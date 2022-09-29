package FirstStepsInCoding;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = 7.61;
        double sqMeters = Double.parseDouble(scanner.nextLine());

        double sum = sqMeters * price;
        double discount = (sum * 18)/100;

        System.out.println("The final price is: " + (sum - discount) + " lv.");
        System.out.println("The discount is: "+ discount + " lv. ");
    }
}
