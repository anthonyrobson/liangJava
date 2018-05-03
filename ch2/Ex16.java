import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter water mass in kilos: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter initial temperature: ");
        double tempInitial = input.nextDouble();

        System.out.print("Enter final temperature: ");
        double tempFinal = input.nextDouble();

        double energy = waterMass * (tempFinal - tempInitial) * 4184;

        System.out.println("The energy needed is " + energy);
    }
}

