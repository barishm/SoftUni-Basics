package t6_whileLoop;
import java.util.Scanner;
public class e06_maxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;
        while (true){
            String input = scan.nextLine();

            if (input.equals("Stop")) {
                break;
            }

            int number = Integer.parseInt(input);
            if(number > maxNumber){
                maxNumber = number;
            }
        }
        System.out.println(maxNumber);
    }
}
