package SimpleConditions;

import java.util.Scanner;

public class P01ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double evaluation = Double.parseDouble(scanner.nextLine());
        if (evaluation >= 5.5) {
            System.out.println("Excellent!");
        }
    }
}
