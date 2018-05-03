import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int n = input.nextInt();

        int sum = n % 10;
        n /= 10;

        sum += n % 10;
        n /= 10;

        sum += n;

        System.out.println("The sum of the digits is " + sum);
    }
}

