package Chapter5;

import java.util.Scanner;

/**
 * Program to collect and count votes
 *
 * @author Jacob Hansen
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int YVotes = 0;
        int NVotes = 0;
        int TotalVotes = 0;
        String Vote = "";
        int InvalidVotes = 0;
        while (!Vote.equals("Q")) {
            System.out.print("Enter Y to vote yes, N for no, and Q to stop voting: ");
            Vote = input.next().toUpperCase();
            if (Vote.equals("Y")) {
                YVotes += 1;
                TotalVotes += 1;
            }
            if (Vote.equals("N")) {
                NVotes += 1;
                TotalVotes += 1;
            }
            if (Vote.equals("Q")) {
                break;
            }
            if (!Vote.equals("Y") && !Vote.equals("N") && !Vote.equals("Q")) {
                System.out.println("INVALID CODE: Enter 'Y' for yes, 'N' for no,"
                        + " or 'Q' to quit voting.");
                TotalVotes += 1;
                InvalidVotes += 1;
            }
        }
        System.out.println("Yes Votes: " + YVotes);
        System.out.println("No Votes: " + NVotes);
        System.out.println("Invalid Votes: " + InvalidVotes);
        System.out.println("Total Votes: " + TotalVotes);
    }
}
