package LoopsExamProblems;

import java.util.Scanner;

public class P04Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nPeriod = Integer.parseInt(scanner.nextLine());
        int docsAvailable = 7;
        int treatedPatients = 0;
        int untreadetPatients = 0;

        for (int i = 1; i <= nPeriod; i++) {
            if (i % 3 == 0) {
                if (untreadetPatients > treatedPatients) {
                    docsAvailable++;
                }
            }
            int patientsCount = Integer.parseInt(scanner.nextLine());

            if (docsAvailable < patientsCount) {
                treatedPatients = treatedPatients + docsAvailable;
                untreadetPatients = untreadetPatients + patientsCount - docsAvailable;
            } else {
                treatedPatients = treatedPatients + patientsCount;
            }

        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreadetPatients);
    }
}
