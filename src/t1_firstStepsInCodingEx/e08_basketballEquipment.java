package t1_firstStepsInCodingEx;
import java.util.Scanner;
public class e08_basketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tax = Integer.parseInt(scanner.nextLine());
        double shoes = tax - (tax * 0.4);
        double equip = shoes - (shoes * 0.2);
        double ball = equip * 0.25;
        double accs = ball * 0.2;
        System.out.println(tax + shoes + equip + ball + accs);
    }
}
