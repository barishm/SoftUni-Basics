package t1_firstStepsInCoding_Ex;
import java.util.Scanner;
public class e02_radiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;
        System.out.println(degrees);
    }
}
