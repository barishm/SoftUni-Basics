package forLoopEx;
import java.util.Scanner;
public class e06_Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String actorName = scan.nextLine();
        double academyPoints = Double.parseDouble(scan.nextLine());
        int evaluators = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < evaluators; i++) {
            String evl = scan.nextLine();
            int length = evl.length();
            double evlPoints = Double.parseDouble(scan.nextLine());
            academyPoints = academyPoints + (length * evlPoints) / 2;
            if(academyPoints >= 1250.5){
                break;
            }
        }
        if(academyPoints < 1250.5){
            System.out.printf("Sorry, %s you need %.1f more!",actorName,1250.5 - academyPoints);
        }
        if(academyPoints >= 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,academyPoints);
        }

    }
}
