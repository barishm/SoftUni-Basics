package t1_firstStepsInCodingEx;
import java.util.Scanner;
public class e04_vacationBooksList {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int hoursHeNeed = pages / pagesPerHour;
        int readPerDay = hoursHeNeed / days;
        System.out.println(readPerDay);


    }
}
