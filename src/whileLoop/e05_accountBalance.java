package whileLoop;
import java.util.Scanner;
public class e05_accountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        while (true) {
            String input = scan.nextLine();

            if (input.equals("NoMoreMoney")) {
                break;
            }

            double money = Double.parseDouble(input);

            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            sum += money;
            System.out.printf("Increase: %.2f%n", money);
        }

        System.out.printf("Total: %.2f", sum);

    }
}
