package t4_forLoop_Lab;
import java.util.Scanner;
public class e06_vowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            switch (String.valueOf(letter).toLowerCase()) {
                case "a":
                    sum += 1;
                    break;
                case "e":
                    sum += 2;
                    break;
                case "i":
                    sum += 3;
                    break;
                case "o":
                    sum += 4;
                    break;
                case "u":
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
