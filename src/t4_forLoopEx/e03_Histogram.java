package t4_forLoopEx;
import java.util.Scanner;
public class e03_Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if(number < 200){
                p1++;
            }
            if(number >= 200 && number < 400){
                p2++;
            }
            if(number >= 400 && number < 600){
                p3++;
            }
            if(number >= 600 && number < 800){
                p4++;
            }
            if(number >= 800){
                p5++;
            }
        }
        System.out.printf("%.2f%%%n", 1.0 * p1 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * p2 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * p3 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * p4 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * p5 / n * 100);
    }
}
