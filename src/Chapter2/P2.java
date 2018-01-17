package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate meal price
 *
 * @author Jacob Hansen
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //meal for Meal Price
        //drink for Drink Price
        //dessert for Dessert Price
        System.out.print("What is the price of the Meal? ");
        double meal = input.nextDouble();
        System.out.print("What is the price of the Drink? ");
        double drink = input.nextDouble();
        System.out.print("What is the price of the Dessert? ");
        double dessert = input.nextDouble();
        double food = meal + drink + dessert;
        double tax = food * 0.10;
        double tip = (tax + food) * 0.15;
        double total = food + tax + tip;
        System.out.println("The Price of Food is: " + food);
        System.out.println("The Tax is: " + tax);
        System.out.println("The Tip is:" + tip);
        System.out.println("The Total Cost is: " + total);
    }
}
