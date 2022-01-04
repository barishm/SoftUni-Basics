package forLoopEx;
import java.util.Scanner;
public class e02_halfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum += number;
            if (number > maxNumber){
                maxNumber = number;
            }
        }
        sum -= maxNumber;
        if(sum == maxNumber){
            System.out.printf("Yes%nSum = %d",sum);
        }
        if(sum > maxNumber){
            System.out.printf("No%nDiff = %d",sum - maxNumber);
        }
        if(maxNumber > sum){
            System.out.printf("No%nDiff = %d",maxNumber - sum);
        }

    }
}
