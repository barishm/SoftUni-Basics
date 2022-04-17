package t2_ConditionalStatements_Ex;
import java.util.Scanner;
public class e02_bonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = Integer.parseInt(scan.nextLine());
        double bonusScore = 0;
        if (score <= 100){
            bonusScore = 5;
        }
        else if(score > 1000){
            bonusScore = score * 0.1;
        }
        else {
            bonusScore = score * 0.2;
        }
        if(score % 2 == 0){
            bonusScore++;
        }
        if (score % 10 == 5){
            bonusScore += 2;
        }
        System.out.println(bonusScore);
        System.out.println(score + bonusScore);

    }
}
