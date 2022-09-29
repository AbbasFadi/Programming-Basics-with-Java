package ExamPrep;

import java.util.Scanner;

public class P01SeriesCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String showName = scanner.nextLine();
        int seasonCount = Integer.parseInt(scanner.nextLine());
        int episodesCount = Integer.parseInt(scanner.nextLine());
        double timeEpisode = Double.parseDouble(scanner.nextLine());

        double adTime = timeEpisode * 0.20;
        double episodeTimePlusAd = timeEpisode + adTime;
        double specialTimeEpisode = seasonCount * 10;
        double totalTime = episodeTimePlusAd * episodesCount * seasonCount + specialTimeEpisode;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", showName, Math.floor(totalTime));

    }
}
