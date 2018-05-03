import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        final double POUNDS_PER_KILO = 0.454;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a weight in pounds: ");
        double pounds = input.nextDouble();

        double kilos = pounds * POUNDS_PER_KILO;

        System.out.println(pounds + " pounds are " + kilos + " kilograms");
    }
}

