package SimpleCalculations;

import java.util.Scanner;

public class P06CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter circle radius. r = ");
        double r = Double.parseDouble(scanner.nextLine());
        System.out.println("Area = " + Math.PI * r * r);
        System.out.println("Perimeter = " + 2 * Math.PI * r);
    }
}
