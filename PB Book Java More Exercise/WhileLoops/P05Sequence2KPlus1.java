package WhileLoops;

import java.util.Scanner;

public class P05Sequence2KPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int k = 1;
        while (k <= n) {
            System.out.println(k);
            k = 2 * k + 1;
        }
    }
}
