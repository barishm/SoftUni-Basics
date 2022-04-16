package t2_ConditionalStatementsEx;

import java.util.Scanner;

public class e08_lunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String serial = scan.nextLine();
        int serialTime = Integer.parseInt(scan.nextLine());
        int lunchTime = Integer.parseInt(scan.nextLine());
        double lunch = lunchTime * 0.125;
        double rest = lunchTime * 0.25;
        double totalTime = lunchTime - lunch - rest;

        if (serialTime <= totalTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial, Math.ceil(totalTime - serialTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial, Math.ceil(serialTime - totalTime));
        }
    }
}




