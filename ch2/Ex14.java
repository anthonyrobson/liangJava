import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        final double KILOS_PER_POUND = 0.45359237;
        final double METRES_PER_INCH = 0.0254;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();

        double kilos = pounds * KILOS_PER_POUND;
        double metres = inches * METRES_PER_INCH;

        double bmi = kilos / (metres * metres);

        System.out.println("BMI is " + bmi);
    }
}

