import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hexagon's side length: ");
        double s = input.nextDouble();

        double area = ((3 * Math.pow(3, 0.5)) / 2.0) * s * s;

        System.out.println("The area of the hexagon is " + area);
    }
}

