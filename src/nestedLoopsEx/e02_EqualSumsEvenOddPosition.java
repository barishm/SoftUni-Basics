package nestedLoopsEx;
import java.util.Scanner;
public class e02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fNumber = Integer.parseInt(scan.nextLine());
        int secNumber = Integer.parseInt(scan.nextLine());

        for (int i = fNumber; i <= secNumber ; i++) {
            String currentNumberAsString = String.valueOf(i);

            int evenSum = 0;
            int oddSum = 0;

            for (int j = 0; j < currentNumberAsString.length(); j++) {
                int currentDigit = Integer.parseInt(
                        String.valueOf(currentNumberAsString.charAt(j)));

                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }

            if (evenSum == oddSum) {
                System.out.print(currentNumberAsString + " ");
            }
        }
    }
}
