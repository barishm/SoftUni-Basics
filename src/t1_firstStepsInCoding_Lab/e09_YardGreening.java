package t1_firstStepsInCoding_Lab;

import java.util.Scanner;

public class e09_YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double eqm = Double.parseDouble(scan.nextLine());
        double price = eqm * 7.61;
        double discount = price * 0.18;
        double dprice = price - discount;
        System.out.println("The final price is: " + dprice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");


    }
}
