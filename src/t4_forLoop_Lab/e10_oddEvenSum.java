package t4_forLoop_Lab;
import java.util.Scanner;
public class e10_oddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                int even = Integer.parseInt(scan.nextLine());
                evenSum += even;
            }
            else{
                int odd = Integer.parseInt(scan.nextLine());
                oddSum += odd;
            }

        }
        if(oddSum == evenSum){
            System.out.printf("Yes%nSum = %d",oddSum);
        }
        if(oddSum > evenSum){
            System.out.printf("No%nDiff = %d",oddSum - evenSum);
        }
        if(evenSum > oddSum){
            System.out.printf("No%nDiff = %d",evenSum - oddSum);
        }


    }
}
