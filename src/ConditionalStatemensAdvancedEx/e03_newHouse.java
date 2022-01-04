package ConditionalStatemensAdvancedEx;
import java.util.Scanner;
public class e03_newHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flowers = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double price = 0;
        switch (flowers){
            case "Roses":
                if(count > 80){
                    price = 5 * count;
                    price = price - (price * 0.1);
                }
                else {
                    price = 5 * count;
                }
                break;
            case "Dahlias":
                if(count > 90){
                    price = 3.80 * count;
                    price = price - (price * 0.15);
                }
                else{
                    price = 3.80 * count;
                }
                break;
            case "Tulips":
                if(count > 80){
                    price = 2.80 * count;
                    price = price - (price * 0.15);
                }
                else{
                    price = 2.80 * count;
                }
                break;
            case "Narcissus":
                if(count < 120){
                    price = 3 * count;
                    price = price + (0.15 * price);
                }
                else{
                    price = 3 * count;
                }
                break;
            case "Gladiolus":
                if(count < 80){
                    price = 2.50 * count;
                    price = price + (0.2 * price);
                }
                else{
                    price = 2.50 * count;
                }
                break;

        }
    if(budget >= price){
        System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count ,flowers,budget - price);
    }
    else{
        System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
    }
    }
}
