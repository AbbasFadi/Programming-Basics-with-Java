package MoreExerciseNestedLoops;

import java.util.Scanner;

public class P14PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for(int num1 =1; num1< n; num1++) {


            for (int num2 = 1; num2 < n; num2++) {

                for(int let = 0; let < 0 + l; let++){
                    char f = alphabet.charAt(let);


                    for(int let2 = 0; let2 <  l; let2++){
                        char f1 = alphabet.charAt(let2);
                        for (int num5=1; num5 <= n; num5++){
                            if (num5 > num1 && num5 > num2){
                                System.out.printf("%d%d%s%s%d ", num1, num2, f, f1, num5);
                            }
                        }


                    }
                }


            }


        }
    }
}
