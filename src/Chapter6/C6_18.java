package Chapter6;

import java.util.Scanner;

/**
 * Program to check the validity or secureness of a password
 *
 * @author Jacob Hansen
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Password: ");
        String Password = input.next();
        if (isValid(Password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    /**
     * Method to check the password's security
     *
     * @param Password the string being checked
     * @return true if passes requirements and false if it doesn't
     */
    public static boolean isValid(String Password) {
        //return true if password:
        //at least 8 characters/only letters and digits/at least 2 digits.
        if (Password.length() < 8) {
            return false;
        }

        for (int i = 0; i < Password.length(); i++) {
            if (!Character.isLetterOrDigit(Password.charAt(i))) {
                return false;
            }
        }
        int DigitCount = 0;
        for (int i = 0; i < Password.length(); i++) {
            if (Character.isDigit(Password.charAt(i))) {
                ++DigitCount;
            }
        }
        if (DigitCount < 2) {
            return false;
        }
        return true;
    }

}
