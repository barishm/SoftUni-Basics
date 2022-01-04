package firstStepsInCodingEx;
import java.util.Scanner;
public class e05_suppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pencils = Integer.parseInt(scanner.nextLine());
        int marker = Integer.parseInt(scanner.nextLine());
        int preparation = Integer.parseInt(scanner.nextLine());
        double discount = Integer.parseInt(scanner.nextLine());
        discount = discount / 100;
        double pencilPrice = pencils * 5.80;
        double markerPrice = marker * 7.20;
        double preparationPrice = preparation * 1.20;
        double price = pencilPrice + markerPrice + preparationPrice;
        double priceWithDiscount = price - (price * discount);
        System.out.println(priceWithDiscount);

    }
}
