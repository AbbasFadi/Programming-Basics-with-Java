package SimpleCalculations;

import java.util.Scanner;

public class P10RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rad = Double.parseDouble(scanner.nextLine());
        double degrees = (180 / Math.PI) * rad;

        System.out.printf("%.2f", degrees);
    }
}