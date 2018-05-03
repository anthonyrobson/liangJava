import javax.swing.JOptionPane;

public class ComputeLoanUsingInputDialog {
    public static void main(String[] args) {
        String annualInterestRateString = JOptionPane.showInputDialog("Enter annual interest rate:");
        double annualInterestRate = Double.parseDouble(annualInterestRateString);
        double monthlyInterestRate = annualInterestRate / 1200;

        String yearsString = JOptionPane.showInputDialog("Enter number of years of loan:");
        int years = Integer.parseInt(yearsString);

        String amountString = JOptionPane.showInputDialog("Enter loan amount:");
        double amount = Double.parseDouble(amountString);

        double monthlyPayment = amount * monthlyInterestRate / (1.0 - 1.0 / Math.pow(1.0 + monthlyInterestRate, years * 12));
        double totalPayment = monthlyPayment * years * 12;

        String output = "The monthly payment is " + ((int)(monthlyPayment * 100) / 100.0) +
            "\nThe total payment is " + ((int)(totalPayment * 100) / 100.0);
        JOptionPane.showMessageDialog(null, output);
    }
}

