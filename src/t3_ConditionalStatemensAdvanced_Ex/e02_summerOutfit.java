package t3_ConditionalStatemensAdvanced_Ex;
import java.util.Scanner;

public class e02_summerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int degrees = Integer.parseInt(scan.nextLine());
        String dayTime = scan.nextLine();
        switch (dayTime) {
            case "Morning":
                if(degrees >= 10 && degrees <= 18){
                    System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", degrees);
                }
                if(degrees > 18 && degrees <= 24){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                }
                if(degrees >= 25){
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degrees);
                }
                break;
            case "Afternoon":
                if(degrees >= 10 && degrees <= 18){
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                }
                if(degrees > 18 && degrees <= 24){
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degrees);
                }
                if(degrees >= 25){
                    System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", degrees);
                }
                break;
            case "Evening":
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                break;

        }
    }
}
