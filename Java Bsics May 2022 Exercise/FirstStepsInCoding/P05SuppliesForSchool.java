package FirstStepsInCoding;

import java.util.Scanner;

public class P05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Входни данни
        //-брой пакет хималки
        int countPens = Integer.parseInt(scanner.nextLine());
        //-брой пакет маркери
        int countMarkers = Integer.parseInt(scanner.nextLine());
        //-литри препарат
        int countLiters = Integer.parseInt(scanner.nextLine());
        //-процент намаление
        int dis = Integer.parseInt(scanner.nextLine());

        //2.Цена химикали - брой пакет хималки * 5.80
        double prisePens = countPens * 5.80;
        //3.Цена маркери - брой пакет маркери * 7.20
        double priseMarkers = countMarkers * 7.20;
        //4. Цена препарат - литри препарат * 1.20
        double priceLiters = countLiters * 1.20;
        //5. Цена за всички материали - Цена химикали + Цена маркери + Цена препарат
        double allPrice = prisePens + priseMarkers + priceLiters;
        //6. Намаление - Цена за всички материали - ((Цена за всички материали * процентнамаление)/100)
        double discount = allPrice - ((allPrice * dis) / 100.0);
        //7.Отпечатване КОЛКО ПАРИ ЩЕ СА НУЖНИ
        System.out.println(discount);
    }
}
