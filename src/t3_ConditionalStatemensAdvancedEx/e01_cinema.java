package t3_ConditionalStatemensAdvancedEx;

import java.util.Scanner;

public class e01_cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projection = scan.nextLine();
        int r = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int totalPlaces = r * c;
        double income = 0.0;

        switch (projection){
            case "Premiere":
                income = totalPlaces * 12.00;
                break;
            case "Normal":
                income = totalPlaces * 7.50;
                break;
            case "Discount":
                income = totalPlaces * 5.00;
                break;

        }
        System.out.printf("%.2f leva", income);
    }
}
