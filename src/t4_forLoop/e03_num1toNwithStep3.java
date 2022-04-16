package t4_forLoop;
import java.util.Scanner;
public class e03_num1toNwithStep3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for(int num = 1;num <= n; num += 3){
            System.out.println(num);
        }
    }
}
