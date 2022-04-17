package t2_ConditionalStatements_Ex;

import java.util.Scanner;

public class e06_worldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double seconds = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double meterpersec = Double.parseDouble(scan.nextLine());
        double resistance = Math.floor(distance / 15) * 12.5;
        double totalTime = distance * meterpersec + resistance;
        if (totalTime < seconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
        else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - seconds);

        }
    }
}
