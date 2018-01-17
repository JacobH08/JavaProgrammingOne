package Chapter6;

import java.util.Scanner;

/**
 * Program to convert dollars to choice currency
 *
 * @author Jacob Hansen
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Euros does a dollar buy? ");
        double EuroEx = input.nextDouble();
        System.out.print("How many Pound Sterlings does a dollar buy? ");
        double PoundEx = input.nextDouble();
        System.out.print("How many Yen does a dollar buy? ");
        double YenEx = input.nextDouble();
        String Continue;
        do {
            System.out.print("Enter the number of Dollars you want to convert:");
            double Dollars = input.nextDouble();
            System.out.print("Enter \"E\" for Euros, \"Y\" for Yen ,or \"P\" for Pounds: ");
            String Choice = input.next().toUpperCase();
            if (Choice.equals("E")) {
                double Euro = conversion(Dollars, EuroEx);
                System.out.printf("For %.2f Dollars, you receive %.2f Euros", Dollars, Euro);
            } else if (Choice.equals("Y")) {
                double Yen = conversion(Dollars, YenEx);
                System.out.printf("For %.2f Dollars, you receive %.2f Euros", Dollars, Yen);
            } else if (Choice.equals("P")) {
                double Pounds = conversion(Dollars, PoundEx);
                System.out.printf("For %.2f Dollars, you receive %.2f Euros", Dollars, Pounds);
            } else {
                System.out.println("Invalid Input");
            }
            System.out.print("\nAre there any more conversions? ");
            Continue = input.next().toLowerCase();
            while (!Continue.equals("no") && !Continue.equals("yes")) {
                System.out.print("Enter \"yes\" to continue or \"no\" to stop converting:");
                Continue = input.next().toLowerCase();
            }
        } while (!Continue.equalsIgnoreCase("no"));
    }

    /**
     * Method to calculate the conversion
     *
     * @param Dollars the amount being exchanged
     * @param CurrencyEx2 the exchange rate of the choice currency
     * @return the amount of the choice currency from after the exchange
     */
    public static double conversion(double Dollars, double CurrencyEx2) {
        if (Dollars <= 100) {
            double AfterTax = Dollars * 0.90;
            double AfterExchange = AfterTax * CurrencyEx2;
            return AfterExchange;
        } else {
            double AfterTax = Dollars * 0.95;
            double AfterExchange = AfterTax * CurrencyEx2;
            return AfterExchange;
        }
    }
}
