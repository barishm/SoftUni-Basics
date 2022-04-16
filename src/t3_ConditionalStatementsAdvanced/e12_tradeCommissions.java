package t3_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class e12_tradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        double volume = Double.parseDouble(scan.nextLine());
        double com = 0;
        switch (city) {
            case "Sofia":
                if (volume <= 500) {
                    com = volume * 0.05;
                } else if (volume > 500 && volume <= 1000) {
                    com = volume * 0.07;
                } else if (volume > 1000 && volume <= 10000) {
                    com = volume * 0.08;
                } else if (volume > 10000) {
                    com = volume * 0.12;
                } else {
                    System.out.println("error");
                    return;
                }
                break;
            case "Varna":
                if (volume <= 500) {
                    com = volume * 0.045;
                } else if (volume > 500 && volume <= 1000) {
                    com = volume * 0.075;
                } else if (volume > 1000 && volume <= 10000) {
                    com = volume * 0.10;
                } else if (volume > 10000) {
                    com = volume * 0.13;
                } else {
                    System.out.println("error");
                    return;
                }
                break;
            case "Plovdiv":
                if (volume >= 0 && volume <= 500) {
                    com = volume * 0.055;
                } else if (volume > 500 && volume <= 1000) {
                    com = volume * 0.08;
                } else if (volume > 1000 && volume <= 10000) {
                    com = volume * 0.12;
                } else if (volume > 10000) {
                    com = volume * 0.145;
                } else {
                    System.out.println("error");
                    return;
                }
                break;
            default:
                System.out.println("error");
                return;
        }
        System.out.printf("%.2f", com);
    }
}
