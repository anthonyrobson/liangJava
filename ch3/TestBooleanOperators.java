import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        System.out.println("Is " + n +
                "\n\tdivisible by 2 and 3? " +
                (n % 2 == 0 && n % 3 == 0) +
                "\n\tdivisible by 2 or 3? " +
                (n % 2 == 0 || n % 3 == 0) +
                "\n\tdivisible by 2 or 3, but not both? " +
                (n % 2 == 0 ^ n % 3 == 0));
    }
}

