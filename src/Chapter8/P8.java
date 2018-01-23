package Chapter8;

import java.util.Scanner;

/**
 * Program to fill in double array and print
 *
 * @author Jacob Hansen
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Salesmen[] = {"A", "B", "C", "D"};
        String Columns[] = {"Salesman", "M", "T", "W", "H", "F", "Total"};
        double Sales[][] = new double[4][5];
        double total[] = new double[4];
        String Again;
        String ID;
        String Day;

        //main loop to see what, where, and how many values to enter
        do {
            //chooses which salesman
            System.out.print("Enter thes salesman ID as A, B, C, D: ");
            ID = input.next().toUpperCase();

            while (!ID.equals("A") && !ID.equals("B") && !ID.equals("C") && !ID.equals("D")) {
                System.out.println("Invalid Input");
                System.out.print("Enter thes salesman ID as A, B, C, D: ");
                ID = input.next().toUpperCase();
            }
            //chooses the day
            System.out.print("Enter the day as M, T, W, H, F: ");
            Day = input.next().toUpperCase();
            switch (Day) {
                case "M":
                    break;
                case "T":
                    break;
                case "W":
                    break;
                case "H":
                    break;
                case "F":
                    break;
                default:
                    while (!Day.equals("M") && !Day.equals("T") && !Day.equals("W") && !Day.equals("H") && !Day.equals("F")) {
                        System.out.println("Invalid Input");
                        System.out.print("Enter the day as M, T, W, H, F: ");
                        Day = input.next().toUpperCase();
                    }
                    break;
            }

            //asks for how much the salesman earned on the previously decided day 
            System.out.print("Enter the amout of sales for " + ID + " on " + Day + ": ");
            double Sale = input.nextDouble();
            //finds where to put sale value in array
            switch (ID) {
                case "A":
                    switch (Day) {
                        case "M":
                            Sales[0][0] += Sale;
                            break;
                        case "T":
                            Sales[0][1] += Sale;
                            break;
                        case "W":
                            Sales[0][2] += Sale;
                            break;
                        case "H":
                            Sales[0][3] += Sale;
                            break;
                        case "F":
                            Sales[0][4] += Sale;
                            break;
                    }
                    break;
                case "B":
                    switch (Day) {
                        case "M":
                            Sales[1][0] += Sale;
                            break;
                        case "T":
                            Sales[1][1] += Sale;
                            break;
                        case "W":
                            Sales[1][2] += Sale;
                            break;
                        case "H":
                            Sales[1][3] += Sale;
                            break;
                        case "F":
                            Sales[1][4] += Sale;
                            break;
                    }
                    break;
                case "C":
                    switch (Day) {
                        case "M":
                            Sales[2][0] += Sale;
                            break;
                        case "T":
                            Sales[2][1] += Sale;
                            break;
                        case "W":
                            Sales[2][2] += Sale;
                            break;
                        case "H":
                            Sales[2][3] += Sale;
                            break;
                        case "F":
                            Sales[2][4] += Sale;
                            break;
                    }
                    break;
                case "D":
                    switch (Day) {
                        case "M":
                            Sales[3][0] += Sale;
                            break;
                        case "T":
                            Sales[3][1] += Sale;
                            break;
                        case "W":
                            Sales[3][2] += Sale;
                            break;
                        case "H":
                            Sales[3][3] += Sale;
                            break;
                        case "F":
                            Sales[3][4] += Sale;
                            break;
                    }
                    break;
            }
            //asks if there's more data
            System.out.print("More Data? Ener Y for more or N to stop: ");
            Again = input.next().toUpperCase();
            while (!Again.equals("Y") && !Again.equals("N")) {
                System.out.println("Invalid Input");
                System.out.print("More Data? Ener Y for more or N to stop: ");
                Again = input.next().toUpperCase();
            }
        } while (Again.equals("Y"));

        //adds up totals
        for (int i = 0; i < Sales.length; i++) {
            for (int j = 0; j < Sales[i].length; j++) {
                total[i] += Sales[i][j];
            }
        }
        //prints days and total labels
        for (int i = 0; i < Columns.length; i++) {
            System.out.print(Columns[i] + "     ");
        }
        //prints the salesmen, the chart, and the totals
        for (int i = 0; i < Sales.length; i++) {
            System.out.print("\n    " + Salesmen[i] + "\t");
            for (int j = 0; j < Sales[i].length; j++) {
                System.out.printf("   %.2f", Sales[i][j]);
            }
            System.out.printf("   %.2f", total[i]);
        }
    }
}
