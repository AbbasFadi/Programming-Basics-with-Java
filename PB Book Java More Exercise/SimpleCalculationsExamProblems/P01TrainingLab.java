package SimpleCalculationsExamProblems;

import java.util.Scanner;

public class P01TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h = Double.parseDouble(scanner.nextLine()) * 100d;
        double w = (Double.parseDouble(scanner.nextLine()) - 1) * 100d;
        int rows = (int) (h / 120d);
        int columns = (int) (w / 70d);
        int seats = rows * columns - 3;
        System.out.println(seats);
    }
}
