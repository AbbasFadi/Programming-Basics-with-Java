package Loops;

import java.util.Scanner;

public class P06MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n ; i++) {
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
        }
        System.out.println("min = " + min);
    }
}
