package ComplexConditions;

import java.util.Scanner;

public class P12Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double volleyballOverall = h + (48 - h) * (3.0 / 4) + p * (2.0 / 3);
        switch (year){
            case "normal":
                System.out.println(Math.floor(volleyballOverall));
                break;
            case "leap":
                double leap = volleyballOverall + 0.15 * volleyballOverall;
                System.out.println(Math.floor(leap));
                break;

        }
    }
}
