public class Ex15 {
    public static void main(String[] args) {
        final double SAVING_PER_MONTH = 100.00;
        final double ANNUAL_INTEREST_RATE = 0.05;
        double monthlyInterestRate = ANNUAL_INTEREST_RATE / 12;

        double balance = 0.00;

        // month 1
        balance = (balance + SAVING_PER_MONTH) * (1.0 + monthlyInterestRate);
        // month 2
        balance = (balance + SAVING_PER_MONTH) * (1.0 + monthlyInterestRate);
        // month 3
        balance = (balance + SAVING_PER_MONTH) * (1.0 + monthlyInterestRate);
        // month 4
        balance = (balance + SAVING_PER_MONTH) * (1.0 + monthlyInterestRate);
        // month 5
        balance = (balance + SAVING_PER_MONTH) * (1.0 + monthlyInterestRate);
        // month 6
        balance = (balance + SAVING_PER_MONTH) * (1.0 + monthlyInterestRate);

        System.out.printf("Balance after six months: $%.2f\n", balance);
    }
}

