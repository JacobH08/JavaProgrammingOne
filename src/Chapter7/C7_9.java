package Chapter7;

import java.util.Scanner;

/**
 * Program to determine which input is smallest
 *
 * @author Jacob Hansen
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Ten Numbers: ");
        double Options[] = new double[10];
        for (int i = 0; i < 10; i++) {
            Options[i] = input.nextDouble();
        }
        double Small = min(Options);
        System.out.println("The minimum number is: " + Small);
    }

    /**
     * Method to determine smallest number
     *
     * @param array the numbers being evaluated
     *
     * @return smallest number in array
     */
    public static double min(double[] array) {
        double small = array[0];
        for (int i = 1; i < 10; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }
        return small;
    }
}
