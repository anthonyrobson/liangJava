import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double t = input.nextDouble();

        System.out.print("Enter wind speed in mph: ");
        double v = input.nextDouble();

        double wci = 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16);

        System.out.println("The wind chill index is " + wci);
    }
}

