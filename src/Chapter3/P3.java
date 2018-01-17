package Chapter3;

import java.util.Scanner;

/**
 * Program to compare two inputed numbers with each other and other scales
 *
 * @author Jacob Hansen
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number for Number1: ");
        double Number1 = input.nextDouble();
        System.out.print("Enter a second Number for Number2: ");
        double Number2 = input.nextDouble();
        if (Number1 < Number2) {
            System.out.println("The first number is less than the second");
        }
        if (Number1 > Number2) {
            System.out.println("The first nember is greater than the second");
        }
        if (Number1 == Number2) {
            System.out.println("The first number is equal to the second");
        }
        if (Number1 <= Number2) {
            System.out.println("The first number is less than or equal to the second");
        }
        if (Number1 != Number2) {
            System.out.println("The first number is not equal to the second");
        }

        if (Number2 == 0) {
            System.out.println("Cannot divide by zero");
        } else if (Number1 / Number2 < 1) {
            System.out.println("Proper Fraction");
        } else {
            System.out.println("Improper Fraction");
        }

        if (Number1 >= 90) {
            System.out.println("A");
        } else if (Number1 >= 80) {
            System.out.println("B");
        } else if (Number1 >= 70) {
            System.out.println("C");
        } else if (Number1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (Number2 >= 1 && Number2 <= 100) {
            System.out.println("In Range");
        } else {
            System.out.println("Out of Range");
        }
    }
}
