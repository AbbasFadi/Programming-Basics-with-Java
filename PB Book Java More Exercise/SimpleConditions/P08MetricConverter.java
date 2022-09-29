package SimpleConditions;

import java.util.Scanner;

public class P08MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        String inputMetric = scanner.nextLine();
        String outputMetric = scanner.nextLine();


        double inMeters = 0;

        switch(inputMetric)
        {
            case "m": inMeters = amount;break;
            case "mm": inMeters = amount/1000;break;
            case "cm": inMeters = amount/100;break;
            case "mi": inMeters = amount/0.000621371192;break;
            case "in": inMeters = amount/39.3700787;break;
            case "km": inMeters = amount*1000;break;
            case "ft": inMeters = amount/3.2808399;break;
            case "yd": inMeters = amount/1.0936133;break;
        }

        double total = 0;

        switch(outputMetric)
        {
            case "m": total = inMeters;break;
            case "mm": total = inMeters*1000.0;break;
            case "cm": total = inMeters*100.0;break;
            case "mi": total = inMeters*0.000621371192;break;
            case "in": total = inMeters*39.3700787;break;
            case "km": total = inMeters/1000.0;break;
            case "ft": total = inMeters*3.2808399;break;
            case "yd": total = inMeters*1.0936133;break;
        }
        System.out.println(String.format("%.8f", total) +" "+ outputMetric);
    }
}
