package t1_firstStepsInCoding_Lab;

import java.util.Scanner;

public class e08_PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dogFoodPacks = Integer.parseInt(scanner.nextLine());
        int catFoodPacks = Integer.parseInt(scanner.nextLine());
        double priceForDogFoodPacks = dogFoodPacks * 2.50;
        int priceForCatFoodPacks = catFoodPacks * 4;
        double overallPrice = priceForCatFoodPacks + priceForDogFoodPacks;
        System.out.printf("%f lv.", overallPrice);
    }
}
