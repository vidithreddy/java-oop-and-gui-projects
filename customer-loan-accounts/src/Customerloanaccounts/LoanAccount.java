package Customerloanaccounts;

/**
 * Represents a generic loan account with principal, interest rate, and term.
 * Serves as a base class for specific loan types demonstrating inheritance.
 */
public class LoanAccount {
    private double principal;
    private double rate;
    private int term;

    /**
     * Constructs a LoanAccount with the given principal, interest rate, and term.
     * 
     * @param principal the loan amount
     * @param rate the annual interest rate
     * @param term the term in years
     */
    public LoanAccount(double principal, double rate, int term) {
        this.principal = principal;
        this.rate = rate;
        this.term = term;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }

    public int getTerm() {
        return term;
    }

    /**
     * Calculates the monthly payment using the standard EMI formula.
     * 
     * @return monthly payment amount
     */
    public double calculateMonthlyPayment() {
        double monthlyRate = rate / (12 * 100);
        int numPayments = term * 12;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, numPayments)) /
                (Math.pow(1 + monthlyRate, numPayments) - 1);
    }

    @Override
    public String toString() {
        return String.format("Principal: $%.2f\nInterest Rate: %.2f%%\nTerm: %d years\nMonthly Payment: $%.2f",
                principal, rate, term, calculateMonthlyPayment());
    }
}
