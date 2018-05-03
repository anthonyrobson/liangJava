import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of minutes: ");
        int minutes = input.nextInt();

        int days = minutes / (60 * 24);
        int years = days / 365;
        int remainingDays = days % 365;

        System.out.println(minutes + " minutes are approximately " + years + " years and " + remainingDays + " days.");
    }
}

