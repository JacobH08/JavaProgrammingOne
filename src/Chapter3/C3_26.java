package Chapter3;
//DivisionBoolean

import java.util.Scanner;

/**
 * Program to calculate if an entered Integer is divisible 0, 1, and or 2
 * numbers
 *
 * @author Jacob Hansen
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Make Scanner
        Scanner input = new Scanner(System.in);
        //Enter input
        System.out.print("Enter an Integer: ");
        int number = input.nextInt();
        //If statements
        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println("Is " + number + " divisible by 5 & 6? True");
        } else if (number % 5 != 0 || number % 6 != 0) {
            System.out.println("Is " + number + " divisible by 5 & 6? False");
        }
        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println("Is " + number + " divisible by 5 or 6? True");
        } else if (number % 5 != 0 && number % 6 != 0) {
            System.out.println("Is " + number + " divisible by 5 or 6? False");
        }
        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println("Is " + number + " divisible by 5 or 6, but not both? True");
        } else if (number % 5 == 0 && number % 6 == 0) {
            System.out.println("Is " + number + " divisible by 5 and 6, but not both? False");
        }
    }
}
