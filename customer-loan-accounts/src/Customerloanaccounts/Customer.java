package Customerloanaccounts;

/**
 * Represents a customer with personal details, address, and a loan account.
 * Demonstrates composition by including Address and LoanAccount objects.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Address address;
    private LoanAccount loanAccount;

    /**
     * Constructs a Customer with personal details, address, and a loan account.
     * 
     * @param firstName Customer's first name
     * @param lastName Customer's last name
     * @param address Customer's mailing address
     * @param loanAccount The customer's associated loan account
     */
    public Customer(String firstName, String lastName, Address address, LoanAccount loanAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.loanAccount = loanAccount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public LoanAccount getLoanAccount() {
        return loanAccount;
    }

    @Override
    public String toString() {
        return "Customer Name: " + firstName + " " + lastName +
                "\nAddress: " + address.toString() +
                "\nLoan Details:\n" + loanAccount.toString();
    }
}
