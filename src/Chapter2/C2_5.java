package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate gratuity
 *
 * @author Jacob Hansen
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Subtotal: ");
        double subtotal = input.nextDouble();
        System.out.print("Enter Gratuity Rate: ");
        double GratuityRate = input.nextDouble();
        double Gratuity = subtotal * GratuityRate / 100;
        double total = Gratuity + subtotal;
        System.out.println("The Gratuity is: " + Gratuity);
        System.out.println("The total is: " + total);
    }
}
