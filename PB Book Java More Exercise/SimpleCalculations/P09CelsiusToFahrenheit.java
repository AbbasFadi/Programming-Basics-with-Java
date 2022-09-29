package SimpleCalculations;

import java.util.Scanner;

public class P09CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsium = Double.parseDouble(scanner.nextLine());
        double far = celsium * 1.8 + 32;
        System.out.printf("%.2f", far);
    }
}
