package t7_nestedLoops_Ex;
import java.util.Scanner;
public class e03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int primeSum = 0;
        int nonPrimeSum = 0;

        while (true) {
            String input = scan.nextLine();

            if (input.equals("stop")) {
                System.out.printf("Sum of all prime numbers is: %d%n",
                        primeSum);
                System.out.printf("Sum of all non prime numbers is: %d",
                        nonPrimeSum);
                break;
            }

            int number = Integer.parseInt(input);

            if (number < 0) {
                System.out.println("Number is negative.");
            } else {
                boolean isPrime = true;

                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primeSum += number;
                } else {
                    nonPrimeSum += number;
                }
            }
        }
    }
}
