package firstStepsInCodingEx;
import java.util.Scanner;
public class e07_foodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());
        double chickenMenuPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.40;
        double veganMenuPrice = veganMenu * 8.15;
        double delivery = 2.50;
        double desert = (chickenMenuPrice + veganMenuPrice + fishMenuPrice) * 0.2;
        System.out.println(chickenMenuPrice + veganMenuPrice + fishMenuPrice + delivery + desert);
    }
}
/*7. Доставка на храна
        Ресторант отваря врати и предлага няколко менюта на преференциални цени:
        • Пилешко меню – 10.35 лв.
        • Меню с риба – 12.40 лв.
        • Вегетарианско меню – 8.15 лв.
        Напишете програма, която изчислява колко ще струва на група хора да си поръчат храна за вкъщи.
        Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
        Цената на доставка е 2.50 лв и се начислява най-накрая.
        Вход
        От конзолата се четат 3 реда:
         Брой пилешки менюта – цяло число в интервала [0 … 99]
         Брой менюта с риба – цяло число в интервала [0 … 99]
         Брой вегетариански менюта – цяло число в интервала [0 … 99]
        Изход
        Да се отпечата на конзолата един ред: &quot;{цена на поръчката}&quot; */