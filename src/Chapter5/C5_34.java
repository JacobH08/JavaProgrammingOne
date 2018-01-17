package Chapter5;

import java.util.Scanner;

/**
 * Program to play Rock, Paper, Scissors
 *
 * @author Jacob Hansen
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int UserPts = 0;
        int ComputerPts = 0;
        System.out.println("You can play until you or the computer wins Twice.");
        // Total rounds variable will be HERE eventually
        while (UserPts < 3 && ComputerPts < 3) {
            System.out.print("Enter Rock(0), Paper(1), or Scissors(2): ");
            int User = input.nextInt();
            int Computer = (int) (Math.random() * 3);
            if (User == 0) {
                if (Computer == 0) {
                    System.out.println("You & the Compter chose Rock: Tie");
                }
                if (Computer == 1) {
                    System.out.println("You chose Rock & the Compter chose Paper: Computer Wins");
                    ComputerPts += 1;

                }
                if (Computer == 2) {
                    System.out.println("You chose Rock & the Compter chose Scissors: You Win");
                    UserPts += 1;
                }
            }
            if (User == 1) {
                if (Computer == 0) {
                    System.out.println("You chose Paper & the Compter chose Rock: You Win");
                    UserPts += 1;
                }
                if (Computer == 1) {
                    System.out.println("You & the Compter chose Paper: Tie");
                }
                if (Computer == 2) {
                    System.out.println("You chose Paper & the Compter chose Scissors: Computer Wins");
                    ComputerPts += 1;
                }
            }
            if (User == 2) {
                if (Computer == 0) {
                    System.out.println("You chose Scissors & the Compter chose Rock: Computer Wins");
                    ComputerPts += 1;
                }
                if (Computer == 1) {
                    System.out.println("You Scissors & the Compter chose Paper: You Win");
                    UserPts += 1;
                }
                if (Computer == 2) {
                    System.out.println("You & the Compter chose Scissors: Tie");
                }
            }
            if (User != 0 && User != 1 && User != 2) {
                System.out.println(User + "is not an option. Try again");
            }
        }
        if (UserPts == 3 || ComputerPts == 3) {
            if (UserPts == 3) {
                System.out.println("You beat the Computer! :)");
            }
            if (ComputerPts == 3) {
                System.out.println("The Computer beat you! :( ");
            }
        }
    }
}
