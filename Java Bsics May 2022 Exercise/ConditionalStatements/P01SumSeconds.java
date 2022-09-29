package ConditionalStatements;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        //да намерим общото време
        int totalTime = timeFirst + timeSecond + timeThird;
        // намираме минутите като делим целочислено
        int minutes = totalTime / 60;
        // намираме секундите като делим с остатък/модулно деление
        int seconds = totalTime % 60;

        //извършваме проверка дали секундите са по-малко от 10
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        }else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
