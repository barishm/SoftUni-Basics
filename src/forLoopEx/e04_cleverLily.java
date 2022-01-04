package forLoopEx;
import java.util.Scanner;
public class e04_cleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double washer = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());
        int toyCount = 0;
        int money = 0;
        int n = 0;
        for (int i = 1; i <= age; i++) {

            if(i % 2 == 0){
                money = money + 10 + n - 1;
                n += 10;
            }
            else{
                toyCount++;
            }

        }
        int finalMoney = money + (toyCount * toyPrice);
        if(finalMoney >= washer){
            System.out.printf("Yes! %.2f",finalMoney - washer);
        }
        else{
            System.out.printf("No! %.2f",washer - finalMoney);
        }
    }
}
