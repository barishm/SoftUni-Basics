package t1_firstStepsInCoding_Ex;
import java.security.interfaces.RSAPrivateCrtKey;
import java .util.Scanner;
public class e03_depositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());
        double interestPerMonth = depositSum * (interestRate / 100) / 12;
        double Sum = depositSum + months * interestPerMonth;
        System.out.println(Sum);

    }
}
