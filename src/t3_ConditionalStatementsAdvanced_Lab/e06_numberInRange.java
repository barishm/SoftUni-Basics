package t3_ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class e06_numberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        if (num >= -100 && num <= 100 && num != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


}

