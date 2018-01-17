package Chapter4;

import java.util.Scanner;

/**
 * Program to compare two bidders' costs and hours
 *
 * @author Jacob Hansen
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first Bidder's Name: ");
        String Bidder1 = input.next();
        System.out.print("Enter the fist Bidder's work Hours: ");
        int Hours1 = input.nextInt();
        System.out.print("Enter the first Bidder's hourly Charge: ");
        double Charge1 = input.nextDouble();

        System.out.print("Enter the second Bidder's Name: ");
        String Bidder2 = input.next();
        System.out.print("Enter the second Bidder's work Hours: ");
        int Hours2 = input.nextInt();
        System.out.print("Enter the second Bidder's hourly Charge: ");
        double Charge2 = input.nextDouble();

        double Cost1 = Hours1 * Charge1;
        double Cost2 = Hours2 * Charge2;
        System.out.printf("\n%s \'s bid costs $%.2f", Bidder1, Cost1);
        System.out.printf("\n%s \'s bid costs $%.2f", Bidder2, Cost2);
        if (Cost1 < Cost2) {
            System.out.printf("\nThe winner is %s with Cost: $%.2f", Bidder1, Cost1);
        }
        if (Cost1 > Cost2) {
            System.out.printf("\nThe winner is %s with Cost: $%.2f", Bidder2, Cost2);
        }
        if (Cost1 == Cost2 && Hours1 < Hours2) {
            System.out.printf("\nThe winner is %s with Cost: $%.2f with Hours: %d",
                    Bidder1, Cost1, Hours1);
        }
        if (Cost1 == Cost2 && Hours1 > Hours2) {
            System.out.printf("\nThe winner is %s with Cost: $%.2f with Hours: %d",
                    Bidder2, Cost2, Hours2);
        }
        if (Cost1 == Cost2 && Hours1 == Hours2) {
            System.out.println();
            System.out.println(Bidder1 + " and " + Bidder2
                    + " have identical bids");
            System.out.printf("\nStats: Hours: %d \nCost/Hour: $%.2f \nTotal Cost: $%.2f\n",
                    Hours1, Charge1, Cost1);
        }
    }
}
