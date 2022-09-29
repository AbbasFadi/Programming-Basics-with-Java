package FirstStepsInCoding;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Входни данни
        int naylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int diluent = Integer.parseInt(scanner.nextLine());
        int hoursWoerkers = Integer.parseInt(scanner.nextLine());

        //2. Обща сума найлон- (необходимо количество найлон(кв.м) + 2) * 1.50
        double priceNaylon = (naylon + 2) * 1.50;
        //3. Обща сума боя- ( необходимо количество боя(литри) * 1.1) * 14.50
        double pricePaint = (paint * 1.1) * 14.50;
        //4. Обща сума разредител- количество разредител(литри) * 5.00
        double priceDiluent = diluent * 5.00;
        //5. сума за торбички- 0.40
        double priceBags = 0.40;
        //6. Обща сума материали-  Обща сума найлон + Обща сума боя + Обща сума разредител +сума за торбички
        double totalPriceNeeds = priceNaylon + priceBags + priceDiluent + pricePaint;
        //7. Сума за майстори-(Обща сума материали * 0.3) * часове майстори
        double priceWorkers = (totalPriceNeeds * 0.3) * hoursWoerkers;
        //8. Крайна сума- Обща сума материали + Сума за майстори
        double totalPriceAll = totalPriceNeeds + priceWorkers;
        //9. отпечатваме крайна сума
        System.out.println(totalPriceAll);
    }
}
