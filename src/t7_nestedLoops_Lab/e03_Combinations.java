package t7_nestedLoops_Lab;
import java.util.Scanner;

public class e03_Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int desNumber = Integer.parseInt(scanner.nextLine());

        int CombCount = 0;

        for (int i = 0; i <= desNumber; i++) {
            for (int j = 0; j <= desNumber; j++) {
                for (int k = 0; k <= desNumber; k++) {
                    if (i + j + k == desNumber) {
                        CombCount++;
                    }
                }
            }
        }

        System.out.println(CombCount);
    }
}