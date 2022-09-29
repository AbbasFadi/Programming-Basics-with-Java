package WhileLoop;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int cakePiece = width * length;
        String command = scanner.nextLine();
        boolean noMoreCake = false;

        while (!command.equals("STOP")) {
            int peaces = Integer.parseInt(command);
            cakePiece = cakePiece - peaces;

            if (cakePiece < 0) {
                noMoreCake = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (noMoreCake) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePiece));
        } else {
            System.out.printf("%d pieces are left.", cakePiece);
        }
    }
}
