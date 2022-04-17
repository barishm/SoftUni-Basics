package t3_ConditionalStatementsAdvanced_Lab;
import java.util.Scanner;
public class e10_invalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        if(num >= 100 && num <= 200 || num == 0){

        }
        else{
            System.out.println("invalid");
        }
    }
}
