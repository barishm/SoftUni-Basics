package t6_whileLoop_Lab;
import java.util.Scanner;
public class e01_readText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        while (!text.equals("Stop")){

            System.out.println(text);
            text = scanner.nextLine();

        }
    }

}
