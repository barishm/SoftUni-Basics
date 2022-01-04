package ConditionalStatementsEx;
import java.util.Scanner;
public class e04_toyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vacation = Double.parseDouble(scan.nextLine());
        int puzzle = Integer.parseInt(scan.nextLine());
        int doll = Integer.parseInt(scan.nextLine());
        int bear = Integer.parseInt(scan.nextLine());
        int minion = Integer.parseInt(scan.nextLine());
        int truck = Integer.parseInt(scan.nextLine());

        double profit = (puzzle * 2.60) + (doll * 3) + (bear * 4.10) + (minion * 8.20) + (truck * 2);
        int totalToys = puzzle + doll + bear + minion + truck;
        if(totalToys >= 50){
            double discount = profit * 0.25;
            profit = profit - discount;
        }
        double rent = profit * 0.1;
        profit = profit - rent;

        if(profit >= vacation){
            System.out.printf("Yes! %.2f lv left.", profit - vacation);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.",vacation - profit);
        }
    }
}
