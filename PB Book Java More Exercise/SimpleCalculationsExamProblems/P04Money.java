package SimpleCalculationsExamProblems;

import java.util.Scanner;

public class P04Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int bitCoins = Integer.parseInt(scanner.nextLine());
        double yuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoinToLv =  bitCoins * 1168 ;
        double yuanToUsd=  yuan * 0.15;
        double dollarsToLv=  yuanToUsd  * 1.76;
        double LvToEuro= (bitcoinToLv + dollarsToLv) / 1.95;
        double CommissionPercentage =  commission / 100;
        double CommissionMoney=   LvToEuro * CommissionPercentage;
        double ConvertedMoney =  LvToEuro - CommissionMoney;

        System.out.println(ConvertedMoney);


    }
}
