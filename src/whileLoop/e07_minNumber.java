package whileLoop;
import java.util.Scanner;
public class e07_minNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        while (true){
            String input = scan.nextLine();

            if (input.equals("Stop")) {
                break;
            }

            int number = Integer.parseInt(input);
            if(number < minNumber){
                minNumber = number;
            }
        }
        System.out.println(minNumber);
    }
}
