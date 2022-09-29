package SimpleConditions;

import java.util.Scanner;

public class P07SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstCompetition = Integer.parseInt(scanner.nextLine());
        int secondCompetition = Integer.parseInt(scanner.nextLine());
        int thirdCompetition = Integer.parseInt(scanner.nextLine());

        int total = firstCompetition + secondCompetition + thirdCompetition;

        int mins = 0;

        if(total > 59 && total <= 119) {
            mins++;
            total -= 60;
        } else if (total > 120) {
            mins += 2;
            total -= 120;
        }
        System.out.printf("%d:%02d", mins, total);

    }
}
