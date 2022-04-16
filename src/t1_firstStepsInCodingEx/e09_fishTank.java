package t1_firstStepsInCodingEx;
import java.util.Scanner;
public class e09_fishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double sqcm = length * width * height;
        double liters = sqcm * 0.001;
        liters = liters - liters * (percent /100);
        System.out.println(liters);

    }
}
