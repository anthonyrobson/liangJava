import java.util.Scanner;

public class ComputeBMI {
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

        System.out.printf("Your BMI is %5.2f\n", bmi);

        if (bmi < 16)
            System.out.println("You are seriously underweight");
        else if (bmi < 18)
            System.out.println("You are underweight");
        else if (bmi < 24)
            System.out.println("You are normal weight");
        else if (bmi < 29)
            System.out.println("You are overweight");
        else if (bmi < 35)
            System.out.println("You are seriously overweight");
        else
            System.out.println("You are gravely overweight");
    }
}

