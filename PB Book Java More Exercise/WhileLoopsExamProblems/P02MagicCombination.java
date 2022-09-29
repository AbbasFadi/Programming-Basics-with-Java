package WhileLoopsExamProblems;

import java.util.Scanner;

public class P02MagicCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 111111; i < 1000000; i++) {
            int currentIndex = i;
            int result = 1;
            while (currentIndex > 0 && result > 0){
                result *= currentIndex % 10;
                currentIndex /= 10;
            }
            if (result == magicNumber) {
                System.out.printf("%d ", i);
            }
        }
    }
}
