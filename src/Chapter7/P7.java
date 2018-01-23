package Chapter7;

import java.util.Scanner;

/**
 * Program to find average of numbers
 *
 * @author Jacob Hansen
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     *
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be read in? ");
        int Array[] = new int[input.nextInt()];
        read(Array, input);
        double Average = average(Array);
        System.out.println("The average is " + Average);
        print(Array);
    }

    /**
     * Method to read in numbers
     *
     * @param Array array that input numbers go into
     * @param input allows numbers to be inputed
     */
    public static void read(int[] Array, Scanner input) {
        System.out.print("Enter the numbers in the list: ");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = input.nextInt();
        }
    }

    /**
     * Method to calculate average
     *
     * @param Array array with numbers being averaged
     * @return average of numbers
     */
    public static double average(int[] Array) {
        double total = 0;
        for (int i = 0; i < Array.length; i++) {
            total += Array[i];
        }
        double Average = total / Array.length;
        return Average;
    }

    /**
     * Method to print the array
     *
     * @param Array array being printed
     */
    public static void print(int[] Array) {
        System.out.print("The Array is: " + java.util.Arrays.toString(Array));
    }
}
