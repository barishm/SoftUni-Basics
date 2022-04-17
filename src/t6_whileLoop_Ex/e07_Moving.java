package t6_whileLoop_Ex;
import java.util.Scanner;
public class e07_Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        int h = Integer.parseInt(scan.nextLine());
        int emptySpace = w * l * h;
        while(emptySpace >= 0){
            String input = scan.nextLine();
            if(input.equals("Done")){
                break;
            }
            emptySpace -= Integer.parseInt(input);
        }
        if(emptySpace < 0 ){
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(emptySpace));
        }
        if(emptySpace >= 0){
            System.out.printf("%d Cubic meters left.", emptySpace);
        }
    }
}
