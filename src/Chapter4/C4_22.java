package Chapter4;
//Substrings

import java.util.Scanner;

/**
 * Program to determine if a string is a substring in another string
 *
 * @author Jacob Hansen
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String S1 = input.next();
        System.out.print("Enter String 2: ");
        String S2 = input.next();
        if (S1.contains(S2)) {
            System.out.printf("%s is a substring of %s.", S2, S1);
        } else {
            System.out.printf("%s is NOT a substring of %s.", S2, S1);
        }
    }
}
