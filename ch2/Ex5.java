import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and tip rate: ");
        double subtotal = input.nextDouble();
        double tipRate = input.nextDouble();

        double tip = subtotal * (tipRate / 100);
        double total = subtotal + tip;

        System.out.println("The tip is " + ((int)(tip * 100) / 100.0) + " and the total is " +
                ((int)(total * 100) / 100.0));
    }
}

