package whileLoopEx;

import java.util.Scanner;

public class e01_oldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String srcBook = scanner.nextLine();
        String currBook = scanner.nextLine();

        boolean areBooksFinished = false;
        int booksCount = 0;

        while (!currBook.equals(srcBook)) {
            if (currBook.equals("No More Books")) {
                areBooksFinished = true;
                break;
            }

            booksCount++;
            currBook = scanner.nextLine();
        }

        if (areBooksFinished) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", booksCount);
        } else {
            System.out.printf("You checked %d books and found it.", booksCount);
        }
    }
}
