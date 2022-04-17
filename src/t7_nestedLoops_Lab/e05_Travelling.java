package t7_nestedLoops_Lab;
import java.util.Scanner;
public class e05_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String destination = scanner.nextLine();

            if (destination.equals("End")) {
                break;
            }

            double destinationPrice = Double.parseDouble(scanner.nextLine());

            double savedMoney = 0;

            while (true) {
                savedMoney += Double.parseDouble(scanner.nextLine());

                if (savedMoney >= destinationPrice) {
                    System.out.printf("Going to %s!%n", destination);
                    break;
                }
            }
        }

    }
}
