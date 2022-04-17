package t4_forLoop_Lab;
import java.util.Scanner;
public class e02_numbersNto1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for(int num = 1;num <= n; num += 3){
            System.out.println(num);
        }
    }
}
