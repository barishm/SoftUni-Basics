package t2_ConditionalStatementsEx;

import java.util.Scanner;

public class e07_shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int gpu = Integer.parseInt(scan.nextLine());
        int cpu = Integer.parseInt(scan.nextLine());
        int ram = Integer.parseInt(scan.nextLine());
        int gpuPrice = gpu * 250;
        double cpuPrice = cpu * gpuPrice * 0.35;
        double ramPrice = ram * gpuPrice * 0.1;
        double totalPrice = gpuPrice + cpuPrice + ramPrice;
        if (gpu > cpu) {
            totalPrice = totalPrice - totalPrice * 0.15;
        }
        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }
    }
}
