package t1_firstStepsInCoding;

import java.util.Scanner;

public class e07_ProjectsCreation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String architectName = scanner.nextLine();
        int amountProjects = Integer.parseInt(scanner.nextLine());
        int overallTime = amountProjects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectName, overallTime, amountProjects);

    }
}
