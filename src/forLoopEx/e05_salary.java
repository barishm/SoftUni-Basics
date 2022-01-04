package forLoopEx;
import java.util.Scanner;
public class e05_salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());
        int g = 0;
        for (int i = 0; i < tabs; i++) {
            String site = scan.nextLine();
            switch (site){
                case "Facebook":
                    g += 150;
                    break;
                case "Instagram":
                    g += 100;
                    break;
                case"Reddit":
                    g += 50;
                    break;
            }
            if(g >= salary){
                break;
            }

        }
        if (g >= salary){
            System.out.println("You have lost your salary.");
        }
        else{
            System.out.println(salary - g);
        }
    }
}
