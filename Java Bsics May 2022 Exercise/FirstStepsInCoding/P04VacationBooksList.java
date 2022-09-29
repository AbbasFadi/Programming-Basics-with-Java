package FirstStepsInCoding;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.Входни данни
        int amountPages = Integer.parseInt(scanner.nextLine());
        int pagesOneHour = Integer.parseInt(scanner.nextLine());
        int amountDays = Integer.parseInt(scanner.nextLine());

        //2.Общо време за чете на книгата = общо страници / страници прочетени за час
        int allTime = amountPages / pagesOneHour;
        //3. необходими часове на ден = Общо време четене на книгата / броят на дните
        int timePerDay = allTime / amountDays;
        //4. да се отпечата броят часове които трябва да отделя на ден.
        System.out.println(timePerDay);
    }
}
