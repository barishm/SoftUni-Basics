package ConditionalStatementsEx;
import java.util.Scanner;
public class e03_timePlus15Mins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int totalTime;
        totalTime = minutes + 15 + (hours * 60);
        int  fHours = totalTime / 60;
        int fMinutes = totalTime % 60;
        if (fHours == 24){
            fHours = 0;
        }
        if(fMinutes < 10) {
            System.out.printf("%d:0%d", fHours, fMinutes);
        }
        else {System.out.printf("%d:%d", fHours, fMinutes);}


        }

    }

