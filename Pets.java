package JavaBasics.ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysNotInHome = Integer.parseInt(scanner.nextLine());
        int foodInKg = Integer.parseInt(scanner.nextLine());
        double foodForDog = Double.parseDouble(scanner.nextLine());
        double foodForCat = Double.parseDouble(scanner.nextLine());
        double foodForTortoise = Double.parseDouble(scanner.nextLine());
        double consumedFood = daysNotInHome * (foodForDog + foodForCat) + foodForTortoise*daysNotInHome/1000;
        double diff = Math.abs(foodInKg-consumedFood);
        if (consumedFood <= foodInKg) {
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }
    }
}
