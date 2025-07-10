package Customerloanaccounts;

/**
 * Represents a car loan account, extending the base LoanAccount.
 * Demonstrates inheritance and method overriding.
 */
public class CarLoan extends LoanAccount {
    private String carMake;
    private String carModel;

    /**
     * Constructs a CarLoan with loan details and car information.
     * 
     * @param principal the principal amount
     * @param rate the annual interest rate
     * @param term the loan term in years
     * @param carMake the make of the car
     * @param carModel the model of the car
     */
    public CarLoan(double principal, double rate, int term, String carMake, String carModel) {
        super(principal, rate, term);
        this.carMake = carMake;
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCar Make: " + carMake + "\nCar Model: " + carModel;
    }
}
