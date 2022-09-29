package SimpleConditions;

import java.util.Scanner;

public class P02ExcellentOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double evaluation = Double.parseDouble(scanner.nextLine());

        if (evaluation >= 5.5) {
            System.out.println("Excellent!");

        } else {
            System.out.println("Not excellent.");
        }
    }
}
