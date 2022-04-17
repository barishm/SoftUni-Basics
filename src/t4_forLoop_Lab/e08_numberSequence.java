package t4_forLoop_Lab;
import java.util.Scanner;
public class e08_numberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if(number > maxNumber){
                maxNumber = number;
            }
            if(number < minNumber){
                minNumber = number;
            }
        }
        System.out.println("Max number: "+maxNumber);
        System.out.println("Min number: "+minNumber);
    }
}
