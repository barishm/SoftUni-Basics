package t7_nestedLoopsEx;
import java.util.Scanner;
public class e05_specialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if ((N % i == 0) && (N % j == 0)
                                && (N % k == 0) && (N % l == 0)) {
                            System.out.printf("%d%d%d%d ",
                                    i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
