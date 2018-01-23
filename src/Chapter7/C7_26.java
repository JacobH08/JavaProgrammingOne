package Chapter7;

import java.util.Scanner;

/**
 * Program to if two strings are identical
 *
 * @author Jacob Hansen
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter List1: ");
        int List1[] = new int[input.nextInt()];
        for (int i = 0; i < List1.length; i++) {
            List1[i] = input.nextInt();
        }
        System.out.print("Enter List2: ");
        int List2[] = new int[input.nextInt()];
        for (int i = 0; i < List2.length; i++) {
            List2[i] = input.nextInt();
        }
        boolean Check = equals(List1, List2);
        System.out.println(Check);
        if (Check == false) {
            System.out.println("Two lists are not strictly identical");
        } else {
            System.out.println("Two lists are strictly identical");
        }
    }

    /**
     * Method to determine if two strings are identical
     *
     * @param List1 the first string being compared
     * @param List2 the second string being compared
     * @return true or false depending on if the are identical
     */
    public static boolean equals(int[] List1, int[] List2) {
        return java.util.Arrays.equals(List1, List2); //this method checks if 2 arrays are equal
    }
}
