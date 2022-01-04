package whileLoopEx;
import java.util.Scanner;
public class e06_Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int pieces = width * length;

        while (pieces >= 0){
            String input = scan.nextLine();

            if (input.equals("STOP")) {
                break;
            }
            pieces -= Integer.parseInt(input);

        }
        if(pieces >= 0){
            System.out.printf("%d pieces are left.",pieces);
        }
        if(pieces < 0){
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(pieces));
        }
    }
}
