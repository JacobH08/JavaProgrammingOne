package Chapter4;
//ClassAndMajor

import java.util.Scanner;

/**
 * Program to determine class and major based on input
 *
 * @author Jacob Hansen
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter M,C, or I and then enter 1,2,3, or 4");
        String a = input.next().toUpperCase();
        char b = a.charAt(0);
        char c = a.charAt(1);
        String output;
        switch (b) {
            case 'M':
                output = "Mathematics";
                break;
            case 'C':
                output = "Computer Science";
                break;
            case 'I':
                output = "Information Technology";
                break;
            default:
                output = "Incorrect Input";
                break;
        }
        if (!(output.equals("Incorrect Input"))) {
            switch (c) {
                case '1':
                    output += " Freshman";
                    break;
                case '2':
                    output += " Sophomore";
                    break;
                case '3':
                    output += " Junior";
                    break;
                case '4':
                    output += " Senior";
                    break;
                default:
                    output = "Incorrect Input";
                    break;
            }
        }
        System.out.println(output);
    }
}
