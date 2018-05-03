import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String employeeName = input.next();

        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax rate: ");
        double fedTaxRate = input.nextDouble();

        System.out.print("Enter state tax rate: ");
        double stateTaxRate = input.nextDouble();

        double grossPay = hours * payRate;
        double fedTax = grossPay * fedTaxRate;
        double stateTax = grossPay * stateTaxRate;
        double deductions = fedTax + stateTax;
        double netPay = grossPay - deductions;

        System.out.println("Employee name: " + employeeName);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay rate: $" + ((int)(payRate * 100) / 100.0));
        System.out.println("Gross pay: $" + ((int)(grossPay * 100) / 100.0));
        System.out.println("Deductions:");
        System.out.println("\tFederal Withholding (" + (fedTaxRate * 100) + "%): $" + ((int)(fedTax * 100) / 100.0));
        System.out.println("\tState Withholding (" + (stateTaxRate * 100) + "%): $" + ((int)(stateTax * 100) / 100.0));
        System.out.println("\tTotal deduction: $" + ((int)(deductions * 100) / 100.0));
        System.out.println("Net pay: $" + ((int)(netPay * 100) / 100.0));
    }
}

