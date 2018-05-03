import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double monthlyInterestRate = input.nextDouble() / 1200;

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double fiv = amount * Math.pow(1.0 + monthlyInterestRate, years * 12);

        System.out.printf("Accumulated value is %.2f\n", fiv);
    }
}

