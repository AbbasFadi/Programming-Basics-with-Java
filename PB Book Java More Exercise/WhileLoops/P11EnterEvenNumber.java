package WhileLoops;

import java.util.Scanner;

public class P11EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("Enter even number.");
            n = Integer.parseInt(scanner.nextLine());
            if (n % 2 == 0) {
                break;
            }
            System.out.println("The number is not even.");
        }
        System.out.printf("Even number entered: %d.", n);

    }
}
