package ExamPrep;

import java.util.Scanner;

public class P02Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minRecord = Integer.parseInt(scanner.nextLine());
        int secRecord = Integer.parseInt(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        int secondsPer100Meters = Integer.parseInt(scanner.nextLine());

        int totalTimeInSeconds = (minRecord * 60) + secRecord;
        double additionalSeconds = (distance / 120) * 2.5;
        double timeMarin = (distance / 100) * secondsPer100Meters - additionalSeconds;

        if (timeMarin <= totalTimeInSeconds) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", timeMarin);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", timeMarin - totalTimeInSeconds);
        }
    }
}
