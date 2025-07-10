package Customerloanaccounts;

/**
 * Represents a customer's mailing address.
 * Demonstrates composition in the customer-loan model.
 */
public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    /**
     * Constructs an Address with specified details.
     * 
     * @param street Street address
     * @param city City name
     * @param state State name
     * @param zip Zip code
     */
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}
