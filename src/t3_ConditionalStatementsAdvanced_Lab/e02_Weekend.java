package t3_ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class e02_Weekend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.nextLine();
        switch(dayOfWeek){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("e02_Weekend");
                break;
            default:
                System.out.println("Error");
                break;


        }
    }
}
