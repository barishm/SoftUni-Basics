package t4_forLoop;
import java.util.Scanner;
public class e09_leftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            leftSum += Integer.parseInt(scan.nextLine());
        }
        for (int i = 0; i < n; i++) {
            rightSum += Integer.parseInt(scan.nextLine());
        }
        if(leftSum == rightSum){
            System.out.println("Yes, sum = "+leftSum);
        }
        if(leftSum > rightSum){
            System.out.printf("No, diff = %d",leftSum - rightSum);
        }
        if(rightSum > leftSum){
            System.out.printf("No, diff = %d",rightSum - leftSum);
        }
    }
}
