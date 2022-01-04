package ConditionalStatementsAdvanced;
import java.util.Scanner;
public class e09_fruitOrVeg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String p = scan.nextLine();

        if("banana".equals(p)||"apple".equals(p)||"kiwi".equals(p)||"cherry".equals(p)||"lemon".equals(p)||"grapes".equals(p)){
            System.out.println("fruit");
        }
        else if("tomato".equals(p)||"cucumber".equals(p)||"pepper".equals(p)||"carrot".equals(p)){
            System.out.println("vegetable");
        }
        else {
            System.out.println("unknown");
        }
    }
}
