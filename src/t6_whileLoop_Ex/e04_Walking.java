package t6_whileLoop_Ex;
import java.util.Scanner;
public class e04_Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int goal = 10000;
        int steps = 0;

        while(steps <= goal){
            String input = scan.nextLine();

            if(input.equals("Going home")){
                steps += Integer.parseInt(scan.nextLine());
                break;
            }
            steps += Integer.parseInt(input);

        }
        if(steps >= goal){
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!",steps - goal);
        }
        else{
            System.out.printf("%d more steps to reach goal.", goal - steps);
        }
    }
}
