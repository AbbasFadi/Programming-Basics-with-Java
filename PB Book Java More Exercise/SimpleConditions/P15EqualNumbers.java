package SimpleConditions;

import java.util.Scanner;

public class P15EqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        String three = scanner.nextLine();

        if (one.equals(two) && one.equals(three)) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }
    }
}
