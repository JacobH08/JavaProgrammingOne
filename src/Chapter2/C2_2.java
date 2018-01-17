package Chapter2;

import java.util.Scanner;

/**
 * The program is to compute volume and area of a cylinder
 *
 * @author Jacob Hansen
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);
        System.out.print("Enter the length: ");
        double length = input.nextDouble();
        double volume = area * length;
        System.out.println("The volume of the cylinder is: " + volume);
    }
}
