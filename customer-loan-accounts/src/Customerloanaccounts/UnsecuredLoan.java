package Customerloanaccounts;

/**
 * Represents an unsecured loan account, extending the base LoanAccount.
 * Demonstrates inheritance with minimal specialization.
 */
public class UnsecuredLoan extends LoanAccount {

    /**
     * Constructs an UnsecuredLoan with the given loan details.
     * 
     * @param principal the loan amount
     * @param rate the annual interest rate
     * @param term the term in years
     */
    public UnsecuredLoan(double principal, double rate, int term) {
        super(principal, rate, term);
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Unsecured Loan";
    }
}
