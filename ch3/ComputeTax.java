import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("0-single filer, 1-married jointly,\n" +
                "2-married separately, 3-head of household)\n" +
                "Enter the filing status: ");
        int status = input.nextInt();

        System.out.print("Enter taxable income: ");
        double income = input.nextDouble();

        double tax = 0;

        final double tax1 = 0.1;
        final double tax2 = 0.15;
        final double tax3 = 0.25;
        final double tax4 = 0.28;
        final double tax5 = 0.33;
        final double tax6 = 0.35;

        final double s0b1 = 8350;
        final double s0b2 = 33950;
        final double s0b3 = 82250;
        final double s0b4 = 171550;
        final double s0b5 = 372950;

        final double s1b1 = 16700;
        final double s1b2 = 67900;
        final double s1b3 = 137050;
        final double s1b4 = 208850;
        final double s1b5 = 372950;

        final double s2b1 = 8350;
        final double s2b2 = 33950;
        final double s2b3 = 68525;
        final double s2b4 = 104425;
        final double s2b5 = 186475;

        final double s3b1 = 11950;
        final double s3b2 = 45500;
        final double s3b3 = 117450;
        final double s3b4 = 190200;
        final double s3b5 = 372950;

        if (status == 0) {
            if (income <= s0b1)
                tax = income * tax1;
            else if (income <= s0b2)
                tax = s0b1 * tax1 + (income - s0b1) * tax2;
            else if (income <= s0b3)
                tax = s0b1 * tax1 + (s0b2 - s0b1) * tax2 + (income - s0b2) * tax3;
            else if (income <= s0b4)
                tax = s0b1 * tax1 + (s0b2 - s0b1) * tax2 + (s0b3 - s0b2) * tax3 + (income - s0b3) * tax4;
            else if (income <= s0b5)
                tax = s0b1 * tax1 + (s0b2 - s0b1) * tax2 + (s0b3 - s0b2) * tax3 + (s0b4 - s0b3) * tax4 + (income - s0b4) * tax5;
            else
                tax = s0b1 * tax1 + (s0b2 - s0b1) * tax2 + (s0b3 - s0b2) * tax3 + (s0b4 - s0b3) * tax4 + (s0b5 - s0b4) * tax5 +
                    (income - s0b5) * tax6;
        } else if (status == 1) {
            if (income <= s1b1)
                tax = income * tax1;
            else if (income <= s1b2)
                tax = s1b1 * tax1 + (income - s1b1) * tax2;
            else if (income <= s1b3)
                tax = s1b1 * tax1 + (s1b2 - s1b1) * tax2 + (income - s1b2) * tax3;
            else if (income <= s1b4)
                tax = s1b1 * tax1 + (s1b2 - s1b1) * tax2 + (s1b3 - s1b2) * tax3 + (income - s1b3) * tax4;
            else if (income <= s1b5)
                tax = s1b1 * tax1 + (s1b2 - s1b1) * tax2 + (s1b3 - s1b2) * tax3 + (s1b4 - s1b3) * tax4 + (income - s1b4) * tax5;
            else
                tax = s1b1 * tax1 + (s1b2 - s1b1) * tax2 + (s1b3 - s1b2) * tax3 + (s1b4 - s1b3) * tax4 + (s1b5 - s1b4) * tax5 +
                    (income - s1b5) * tax6;
        } else if (status == 2) {
            if (income <= s2b1)
                tax = income * tax1;
            else if (income <= s2b2)
                tax = s2b1 * tax1 + (income - s2b1) * tax2;
            else if (income <= s2b3)
                tax = s2b1 * tax1 + (s2b2 - s2b1) * tax2 + (income - s2b2) * tax3;
            else if (income <= s2b4)
                tax = s2b1 * tax1 + (s2b2 - s2b1) * tax2 + (s2b3 - s2b2) * tax3 + (income - s2b3) * tax4;
            else if (income <= s2b5)
                tax = s2b1 * tax1 + (s2b2 - s2b1) * tax2 + (s2b3 - s2b2) * tax3 + (s2b4 - s2b3) * tax4 + (income - s2b4) * tax5;
            else
                tax = s2b1 * tax1 + (s2b2 - s2b1) * tax2 + (s2b3 - s2b2) * tax3 + (s2b4 - s2b3) * tax4 + (s2b5 - s2b4) * tax5 +
                    (income - s2b5) * tax6;
        } else if (status == 3) {
            if (income <= s3b1)
                tax = income * tax1;
            else if (income <= s3b2)
                tax = s3b1 * tax1 + (income - s3b1) * tax2;
            else if (income <= s3b3)
                tax = s3b1 * tax1 + (s3b2 - s3b1) * tax2 + (income - s3b2) * tax3;
            else if (income <= s3b4)
                tax = s3b1 * tax1 + (s3b2 - s3b1) * tax2 + (s3b3 - s3b2) * tax3 + (income - s3b3) * tax4;
            else if (income <= s3b5)
                tax = s3b1 * tax1 + (s3b2 - s3b1) * tax2 + (s3b3 - s3b2) * tax3 + (s3b4 - s3b3) * tax4 + (income - s3b4) * tax5;
            else
                tax = s3b1 * tax1 + (s3b2 - s3b1) * tax2 + (s3b3 - s3b2) * tax3 + (s3b4 - s3b3) * tax4 + (s3b5 - s3b4) * tax5 +
                    (income - s3b5) * tax6;
        } else {
            System.out.println("Error: invalid status");
            System.exit(0);
        }

        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
    }
}

