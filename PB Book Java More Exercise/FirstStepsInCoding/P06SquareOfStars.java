package FirstStepsInCoding;

import java.util.Scanner;

public class P06SquareOfStars {
    public static void main(String[] args) {

        String star = "*";
        Scanner s2 = new Scanner(System.in);
        int n = s2.nextInt();
        for (int a = 1; a <= n; a++) {
            if (a == 1 || a == n) {
                for (int i = 1; i <= n; i++) {
                    System.out.print(star);
                }
            } else for (int b = 1; b <= n; b++) {
                if (b == 1 || b == n) {
                    System.out.print(star);
                } else System.out.print(" ");
            }
            System.out.print("\n");
            }
        }
    }
