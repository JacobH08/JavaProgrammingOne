package Chapter3;
//RiceCost

import java.util.Scanner;

/**
 * Program to calculate price per weight and compare items
 *
 * @author Jacob Hansen
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight and price of Package 1: ");
        double Weight1 = input.nextDouble();
        double Price1 = input.nextDouble();
        double Cost1 = Price1 / Weight1;
        System.out.print("Enter the weight and price of Package 2: ");
        double Weight2 = input.nextDouble();
        double Price2 = input.nextDouble();
        double Cost2 = Price2 / Weight2;
        if (Cost1 < Cost2) {
            System.out.println("The 1st Package has a better price");
        } else if (Cost2 < Cost1) {
            System.out.println("The 2nd Package has a better price");
        } else if (Cost1 == Cost2) {
            System.out.println("Both Packages have the same Cost Per Pound");
        }
    }
}
