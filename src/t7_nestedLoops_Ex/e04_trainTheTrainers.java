package t7_nestedLoops_Ex;
import java.util.Scanner;
public class e04_trainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        int judgesCount = Integer.parseInt(scanner.nextLine());

        double totalAverageGrade = 0;
        int presentationCount = 0;

        while (true) {
            String presentationName = scanner.nextLine();

            if (presentationName.equals("Finish")) {
                System.out.printf("Student's final assessment is %.2f.",
                        totalAverageGrade / presentationCount);
                break;
            }

            presentationCount++;
            double currentAverageGrade = 0;

            for (int i = 0; i < judgesCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                currentAverageGrade += grade;
            }

            currentAverageGrade /= judgesCount;

            System.out.printf("%s - %.2f.%n",
                    presentationName, currentAverageGrade);

            totalAverageGrade += currentAverageGrade;
        }
    }
}
