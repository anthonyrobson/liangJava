import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int dollars = remainingAmount / 100;
        remainingAmount %= 100;

        int quarters = remainingAmount / 25;
        remainingAmount %= 25;

        int dimes = remainingAmount / 10;
        remainingAmount %= 10;

        int nickels = remainingAmount / 5;
        remainingAmount %= 5;

        int pennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of\n" +
                "\t" + dollars + " dollars\n" +
                "\t" + quarters + " quarters\n" +
                "\t" + dimes + " dimes\n" +
                "\t" + nickels + " nickels\n" +
                "\t" + pennies + " pennies");
    }
}

