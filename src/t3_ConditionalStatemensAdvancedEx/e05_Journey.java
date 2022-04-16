package t3_ConditionalStatemensAdvancedEx;
import java.util.Scanner;
public class e05_Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        double price = 0;
        if (budget <= 100) {
            if ("summer".equals(season)) {
                price = budget * 0.3;
            }
            if ("winter".equals(season)) {
                price = budget * 0.7;
            }
        }
        if (budget > 100 && budget <= 1000) {
            if ("summer".equals(season)) {
                price = budget * 0.4;
            }
            if ("winter".equals(season)) {
                price = budget * 0.8;
            }
        }
        if (budget > 1000) {
            price = budget * 0.9;
        }
        if ("winter".equals(season) && budget <= 100) {
            System.out.println("Somewhere in Bulgaria");
            System.out.printf("Hotel - %.2f", price);
        }
        if ("summer".equals(season) && budget <= 100) {
            System.out.println("Somewhere in Bulgaria");
            System.out.printf("Camp - %.2f", price);
        }
        if ("winter".equals(season) && budget > 100 && budget <= 1000) {
            System.out.println("Somewhere in Balkans");
            System.out.printf("Hotel - %.2f", price);
        }
        if ("summer".equals(season) && budget > 100 && budget <= 1000) {
            System.out.println("Somewhere in Balkans");
            System.out.printf("Camp - %.2f", price);
        }
        if ("winter".equals(season) && budget > 1000) {
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", price);
        }
        if ("summer".equals(season) && budget > 1000) {
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", price);
        }


    }
}
