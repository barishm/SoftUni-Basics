package t3_ConditionalStatementsAdvanced;
import java.util.Scanner;
public class e05_smallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String city = scan.nextLine();
        double amount = Double.parseDouble(scan.nextLine());
        if("coffee".equals(product)){
            if("Sofia".equals(city)){
                System.out.println(amount * 0.50);
            }
            if("Plovdiv".equals(city)){
                System.out.println(amount * 0.40);
            }
            if ("Varna".equals(city)) {
                System.out.println(amount * 0.45);
            }
        }
        if("water".equals(product)){
            if("Sofia".equals(city)){
                System.out.println(amount * 0.80);
            }
            if("Plovdiv".equals(city)){
                System.out.println(amount * 0.70);
            }
            if ("Varna".equals(city)) {
                System.out.println(amount * 0.70);
            }
        }
        if("beer".equals(product)){
            if("Sofia".equals(city)){
                System.out.println(amount * 1.20);
            }
            if("Plovdiv".equals(city)){
                System.out.println(amount * 1.15);
            }
            if ("Varna".equals(city)) {
                System.out.println(amount * 1.10);
            }
        }
        if("sweets".equals(product)){
            if("Sofia".equals(city)){
                System.out.println(amount * 1.45);
            }
            if("Plovdiv".equals(city)){
                System.out.println(amount * 1.30);
            }
            if ("Varna".equals(city)) {
                System.out.println(amount * 1.35);
            }
        }
        if("peanuts".equals(product)){
            if("Sofia".equals(city)){
                System.out.println(amount * 1.60);
            }
            if("Plovdiv".equals(city)){
                System.out.println(amount * 1.50);
            }
            if ("Varna".equals(city)) {
                System.out.println(amount * 1.55);
            }
        }
    }
}
