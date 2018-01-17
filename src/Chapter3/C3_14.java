package Chapter3;
//Heads or Tails

import java.util.Scanner;

/**
 * Program to play Heads or Tails coin flip
 *
 * @author Jacob Hansen
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int number = (int) (Math.random() * 2);
        Scanner input = new Scanner(System.in);
        System.out.println("Heads = 1");
        System.out.println("Tails = 0");
        System.out.println("Choose Heads or Tails: ");
        int answer = input.nextInt();
        if (number == 0 && answer == 0) {
            System.out.println("You entered Tails and it was Tails");
        } else if (number == 1 && answer == 0) {
            System.out.println("You entered Tails and it was Heads");
        }
        if (number == 1 && answer == 1) {
            System.out.println("You entered Heads and it was Heads");
        } else if (number == 0 && answer == 1) {
            System.out.println("You entered Heads and it was Tails");
        }
    }
}
