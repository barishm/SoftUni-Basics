package t3_ConditionalStatementsAdvanced_Lab;
import java.util.Scanner;
public class e07_workingHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();
        if("Monday".equals(day)||"Tuesday".equals(day)||"Wednesday".equals(day)||"Thursday".equals(day)||"Friday".equals(day)||"Saturday".equals(day)){
            if(time >= 10 && time <= 18){
                System.out.println("open");
            }
            else{
                System.out.println("closed");
            }
        }
        if("Sunday".equals(day)){
            System.out.println("closed");
        }

    }
}
