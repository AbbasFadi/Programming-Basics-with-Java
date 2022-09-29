package MoreExercisesConditionalStatements;

import java.util.Scanner;

public class P06FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Магнолии – 3.25 лева
        //•	Зюмбюли – 4 лева
        //•	Рози – 3.50 лева
        //•	Кактуси – 8 лева

      //•	Брой магнолии – цяло число в интервала [0 … 50]
        int countMag = Integer.parseInt(scanner.nextLine());
        //•	Брой зюмбюли – цяло число в интервала [0 … 50]
        int countZum = Integer.parseInt(scanner.nextLine());
        //•	Брой рози – цяло число в интервала [0 … 50]
        int countRoz = Integer.parseInt(scanner.nextLine());
        //•	Брой кактуси – цяло число в интервала [0 … 50]
        int countKak = Integer.parseInt(scanner.nextLine());
        //•	Цена на подаръка – реално число в интервала [0.00 … 500.00]
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = countMag * 3.25 + countZum * 4.00 + countRoz * 3.50 + countKak * 8.00 ;
        double tax = totalPrice * 0.05;
        double win = totalPrice - tax;
        double difference = Math. abs(giftPrice - win);


        if (win >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(difference));
        } else
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(difference));
        }

}

