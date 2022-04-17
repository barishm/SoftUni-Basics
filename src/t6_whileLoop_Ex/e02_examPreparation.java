package t6_whileLoop_Ex;
import java.util.Scanner;
public class e02_examPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failGradesAllowed = Integer.parseInt(scanner.nextLine());

        int failGradesMade = 0;
        double averageGrade = 0;
        int tasksCount = 0;
        String lastTask = "";

        while (true) {
            String taskName = scanner.nextLine();

            if (taskName.equals("Enough")) {
                System.out.printf("Average score: %.2f%n", averageGrade / tasksCount);
                System.out.printf("Number of problems: %d%n", tasksCount);
                System.out.printf("Last problem: %s", lastTask);
                break;
            }

            lastTask = taskName;
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                failGradesMade++;

                if (failGradesMade >= failGradesAllowed) {
                    System.out.printf("You need a break, %d poor grades.", failGradesMade);
                    break;
                }
            }

            averageGrade += grade;
            tasksCount++;
        }
    }
}
