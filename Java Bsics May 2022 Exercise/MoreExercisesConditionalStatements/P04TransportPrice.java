package MoreExercisesConditionalStatements;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int KmCount = Integer.parseInt(scanner.nextLine());
        String dayOrNight = (scanner.nextLine());

        double TaxiPrizeStart = 0.70;
        double TaxiPrizeDay = 0.79;
        double TaxiPrizeNight = 0.90;
        double BusPrize = 0.09;
        double TrainPrize = 0.06;
        double DayTotalWithTaxi = TaxiPrizeStart + KmCount * TaxiPrizeDay;
        double NightTotalWithTaxi = TaxiPrizeStart + KmCount * TaxiPrizeNight;
        double TotalWithBus = KmCount * BusPrize;
        double TotalWithTrain = KmCount * TrainPrize;
        if ( KmCount < 20 && dayOrNight.equalsIgnoreCase("day")){
            System.out.printf("%.2f", DayTotalWithTaxi);
        }
        else if ( KmCount < 20 && dayOrNight.equalsIgnoreCase("night")){
            System.out.printf("%.2f", NightTotalWithTaxi);

        } else if (KmCount >= 20 && KmCount < 100 ){
            System.out.printf("%.2f", TotalWithBus);
        } else if (KmCount >= 100){
            System.out.printf("%.2f", TotalWithTrain);
        }

    }
}
