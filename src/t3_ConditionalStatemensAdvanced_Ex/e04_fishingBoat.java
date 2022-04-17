package t3_ConditionalStatemensAdvanced_Ex;

import java.util.Scanner;

public class e04_fishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        int fishman = Integer.parseInt(scan.nextLine());
        double boatPrice = 0;
        switch (season) {
            case "Spring":
                boatPrice = 3000;
                if (fishman <= 6) {
                    boatPrice = boatPrice - (boatPrice * 0.10);
                } else if (fishman >= 7 && fishman <= 11) {
                    boatPrice = boatPrice - (boatPrice * 0.15);
                } else if (fishman >= 12) {
                    boatPrice = boatPrice - (boatPrice * 0.25);
                }
                if (fishman % 2 == 0) {
                    boatPrice = boatPrice - (boatPrice * 0.05);
                }
                break;
            case "Summer":
                boatPrice = 4200;
                if (fishman <= 6) {
                    boatPrice = boatPrice - (boatPrice * 0.10);
                } else if (fishman >= 7 && fishman <= 11) {
                    boatPrice = boatPrice - (boatPrice * 0.15);
                } else if (fishman >= 12) {
                    boatPrice = boatPrice - (boatPrice * 0.25);
                }
                if (fishman % 2 == 0) {
                    boatPrice = boatPrice - (boatPrice * 0.05);
                }
                break;
            case "Autumn":
                boatPrice = 4200;
                if (fishman <= 6) {
                    boatPrice = boatPrice - (boatPrice * 0.10);
                } else if (fishman >= 7 && fishman <= 11) {
                    boatPrice = boatPrice - (boatPrice * 0.15);
                } else if (fishman >= 12) {
                    boatPrice = boatPrice - (boatPrice * 0.25);
                }
                break;
            case "Winter":
                boatPrice = 2600;
                if (fishman <= 6) {
                    boatPrice = boatPrice - (boatPrice * 0.10);
                } else if (fishman >= 7 && fishman <= 11) {
                    boatPrice = boatPrice - (boatPrice * 0.15);
                } else if (fishman >= 12) {
                    boatPrice = boatPrice - (boatPrice * 0.25);
                }
                if (fishman % 2 == 0) {
                    boatPrice = boatPrice - (boatPrice * 0.05);
                }
                break;
        }
        if (budget >= boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - boatPrice);
        } else {
            double problem = boatPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva.", boatPrice - budget);
        }
    }
}
