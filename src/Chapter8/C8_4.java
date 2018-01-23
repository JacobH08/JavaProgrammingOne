package Chapter8;

import java.util.Scanner;

/**
 * Program to print double array
 *
 * @author Jacob Hansen
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Week[][] = {
            {2, 4, 3, 4, 5, 8, 8, 0},
            {7, 3, 4, 3, 3, 4, 4, 0},
            {3, 3, 4, 3, 3, 2, 2, 0},
            {9, 3, 4, 7, 3, 4, 1, 0},
            {3, 5, 4, 3, 6, 3, 8, 0},
            {3, 4, 4, 6, 3, 4, 4, 0},
            {3, 7, 4, 8, 3, 8, 4, 0},
            {6, 3, 5, 9, 2, 7, 9, 0}
        };
        for (int i = 0; i < Week.length; i++) {
            for (int j = 0; j < Week[i].length - 1; j++) {
                Week[i][7] += Week[i][j];

            }
        }
        String Employees[] = new String[8];
        Employees[0] = "Employee0";
        Employees[1] = "Employee1";
        Employees[2] = "Employee2";
        Employees[3] = "Employee3";
        Employees[4] = "Employee4";
        Employees[5] = "Employee5";
        Employees[6] = "Employee6";
        Employees[7] = "Employee7";
        System.out.println("\t        Su  M   T   W  Th   F  Sa  Total");
        for (int i = 0; i < Week.length; i++) {
            System.out.print("\n" + Employees[i] + "\t");
            for (int j = 0; j < Week[i].length; j++) {
                System.out.print(Week[i][j] + "   ");
            }
        }
        int best = 0;
        for (int i = 0; i < Week[i].length; i++) {

        }
    }
}
