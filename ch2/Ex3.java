import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        final double FEET_PER_METRE = 0.305;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a distance in feet: ");
        double feet = input.nextDouble();

        double metres = feet * FEET_PER_METRE;

        System.out.println(feet + " feet are " + metres + " metres");
    }
}

