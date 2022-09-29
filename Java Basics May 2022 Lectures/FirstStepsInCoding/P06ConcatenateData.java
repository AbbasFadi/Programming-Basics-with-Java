package FirstStepsInCoding;

import java.util.Scanner;

public class P06ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //You are <firstName> <lastName>, a <age>-years old person from <town>

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner. nextLine());
        String town = scanner.nextLine();

        String data = "You are "
                + firstName + " "
                + lastName + ", a "
                + age + "-years old person from "
                + town + ".";
        System.out.println(data);

    }
}
