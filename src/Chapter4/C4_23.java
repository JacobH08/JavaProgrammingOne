package Chapter4;
//Payroll

import java.util.Scanner;

/**
 * Program to determine payroll of employee including taxes
 *
 * @author Jacob Hansen
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String Employee = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        int Hours = input.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double PayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate as decimal: ");
        double FedTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate as decimal: ");
        double StateTaxRate = input.nextDouble();
        System.out.println("Emplyee's Name: " + Employee);
        System.out.println("Hours Worked: " + Hours);
        System.out.printf("Pay Rate: %.2f", PayRate);
        double GrossPay = PayRate * Hours;
        System.out.println("\nGross Pay: " + GrossPay);
        double FedTax = GrossPay * FedTaxRate;
        double FedTaxPer = FedTaxRate * 100;
        double StateTaxPer = StateTaxRate * 100;
        System.out.println("Deduction:");
        System.out.printf("\tFederal Withholding( %.2f Percent): %.2f", FedTaxPer, FedTax);
        double StateTax = GrossPay * StateTaxRate;
        System.out.printf("\n\tState Withholding( %.2f Percent): %.2f", StateTaxPer, StateTax);
        double TotalTax = StateTax + FedTax;
        System.out.printf("\n\tTotal Deduction: %.2f", TotalTax);
        double NetPay = GrossPay - TotalTax;
        System.out.printf("\nNet Pay: %.2f", NetPay);
    }
}
