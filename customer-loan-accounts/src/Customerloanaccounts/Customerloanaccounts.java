package Customerloanaccounts;

/**
 * Main driver class for the Customer Loan Accounts system.
 * Demonstrates the creation of customers with different types of loan accounts,
 * showcasing inheritance and composition in an object-oriented design.
 */
public class Customerloanaccounts {

    /**
     * Entry point of the application.
     * Creates sample customers with various loan types and prints their details.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Address addr1 = new Address("123 Main St", "Springfield", "IL", "62701");
        CarLoan carLoan = new CarLoan(25000, 5.5, 5, "Toyota", "Camry");
        Customer cust1 = new Customer("John", "Doe", addr1, carLoan);

        Address addr2 = new Address("456 Oak Ave", "Rivertown", "CA", "90210");
        PrimaryMortgage mortgage = new PrimaryMortgage(300000, 4.0, 30, "123 Main St", 2000);
        Customer cust2 = new Customer("Jane", "Smith", addr2, mortgage);

        Address addr3 = new Address("789 Pine Rd", "Lakeside", "NY", "10001");
        UnsecuredLoan unsecuredLoan = new UnsecuredLoan(10000, 8.5, 3);
        Customer cust3 = new Customer("Bob", "Johnson", addr3, unsecuredLoan);

        System.out.println(cust1);
        System.out.println("\n-------------------\n");
        System.out.println(cust2);
        System.out.println("\n-------------------\n");
        System.out.println(cust3);
    }
}
