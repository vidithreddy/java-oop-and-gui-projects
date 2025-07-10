package Customerloanaccounts;

/**
 * Represents a primary mortgage loan, extending the base LoanAccount.
 * Adds property-specific details such as address and tax.
 * Demonstrates inheritance and method overriding.
 */
public class PrimaryMortgage extends LoanAccount {
    private String propertyAddress;
    private double propertyTax;

    /**
     * Constructs a PrimaryMortgage with loan details and property information.
     * 
     * @param principal the loan amount
     * @param rate the annual interest rate
     * @param term the term in years
     * @param propertyAddress the address of the property
     * @param propertyTax the annual property tax
     */
    public PrimaryMortgage(double principal, double rate, int term, String propertyAddress, double propertyTax) {
        super(principal, rate, term);
        this.propertyAddress = propertyAddress;
        this.propertyTax = propertyTax;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProperty Address: " + propertyAddress + "\nProperty Tax: $" + propertyTax;
    }
}
