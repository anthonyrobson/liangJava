import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("Enter number of years of loan: ");
        int years = input.nextInt();

        System.out.print("Enter loan amount: ");
        double amount = input.nextDouble();

        double monthlyPayment = amount * monthlyInterestRate / (1.0 - 1.0 / Math.pow(1.0 + monthlyInterestRate, years * 12));
        double totalPayment = monthlyPayment * years * 12;

        System.out.println("The monthly payment is " + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is " + (int)(totalPayment * 100) / 100.0);
    }
}

