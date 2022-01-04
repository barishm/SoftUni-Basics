package nestedLoopsEx;
import java.util.Scanner;
public class e01_numberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int counter = 1;
        boolean isBigger = false;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(counter + " ");
                counter++;
                if (counter > N) {
                    isBigger = true;
                    break;
                }
            }
            if (isBigger) {
                break;
            }
            System.out.println();
        }
    }
}
