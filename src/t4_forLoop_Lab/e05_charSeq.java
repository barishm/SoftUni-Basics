package t4_forLoop_Lab;
import java.util.Scanner;
public class e05_charSeq {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            System.out.println(letter);
        }
    }
}
