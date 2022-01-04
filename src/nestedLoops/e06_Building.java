package nestedLoops;
import java.util.Scanner;
public class e06_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floorsCount = Integer.parseInt(scanner.nextLine());
        int roomsPerFloor = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();
        for (int f = floorsCount; f >= 1 ; f--) {
            for (int r = 0; r < roomsPerFloor; r++) {
                if (f == floorsCount) {
                    sb.append("L" + f + r + " ");
                } else {
                    if (f % 2 == 0) {
                        sb.append("O" + f + r + " ");
                    } else {
                        sb.append("A" + f + r + " ");
                    }
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
