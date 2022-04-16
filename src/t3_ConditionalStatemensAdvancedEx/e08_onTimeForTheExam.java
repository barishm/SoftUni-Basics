package t3_ConditionalStatemensAdvancedEx;
import java.util.Scanner;

public class e08_onTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHours = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHours = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTime = examHours * 60 + examMinutes;
        int arrivalTime = arrivalHours * 60 + arrivalMinutes;

        if (arrivalTime > examTime) {
            System.out.println("Late");

            int difference = arrivalTime - examTime;

            if (difference < 60) {
                System.out.printf("%d minutes after the start", difference);
            } else {
                System.out.printf("%d:%02d hours after the start", difference / 60, difference % 60);
            }
        } else if (arrivalTime >= examTime - 30) {
            System.out.println("On time");

            int difference = examTime - arrivalTime;

            if (difference != 0) {
                System.out.printf("%d minutes before the start", difference);
            }
        } else {
            System.out.println("Early");

            int difference = examTime - arrivalTime;

            if (difference < 60) {
                System.out.printf("%d minutes before the start", difference);
            } else {
                System.out.printf("%d:%02d hours before the start", difference / 60, difference % 60);
            }
        }
    }
}
