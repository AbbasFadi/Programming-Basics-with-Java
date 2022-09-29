package ComplexConditionsExamProblems;

import java.util.Scanner;

public class P03Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        String opetator = scanner.nextLine();

        double result = 0;
        String evenOrOdd = "";
        boolean isZero = false;

        switch (opetator) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                if (numberTwo == 0) {
                    isZero = true;
                } else {
                    result = numberOne * 1.0 / numberTwo;
                }
                break;
            case "%":
                if (numberTwo == 0) {
                    isZero = true;
                }else {
                    result = numberOne % numberTwo;
                }
                break;
        }
        if (result % 2 == 0) {
            evenOrOdd = "even";
        } else {
            evenOrOdd = "odd";
        }
        if (opetator.equals("+") || opetator.equals("-") || opetator.equals("*")) {
            System.out.printf("%d %s %d = %.0f - %s ", numberOne, opetator, numberTwo, result, evenOrOdd);
        } else if (opetator.equals("/") && !isZero) {
            System.out.printf("%d %s %d = %.2f", numberOne, opetator, numberTwo, result);
        } else if (opetator.equals("%") && !isZero) {
            System.out.printf("%d %s %d = %.0f", numberOne, opetator, numberTwo, result);
        } else {
            System.out.printf("Cannot divide %d by zero", numberOne);
        }
    }
}
