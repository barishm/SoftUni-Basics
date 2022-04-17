package t4_forLoop_Ex;
import java.util.Scanner;
public class e08_tennis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tournamentsCount = Integer.parseInt(scan.nextLine());
        int startingPoints = Integer.parseInt(scan.nextLine());
        int wPoints = 0;
        int wTournaments = 0;
        for (int i = 0; i < tournamentsCount; i++) {
            String stageReached = scan.nextLine();

            switch (stageReached) {
                case "W":
                    wPoints += 2000;
                    wTournaments++;
                    break;
                case "F":
                    wPoints += 1200;
                    break;
                case "SF":
                    wPoints += 720;
                    break;
            }
        }
        System.out.printf("Final points: %d%n", startingPoints + wPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(wPoints * 1.0 / tournamentsCount));
        System.out.printf("%.2f%%", wTournaments * 1.0 / tournamentsCount * 100);
    }
}
