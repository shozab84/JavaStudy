package AddressBook;

/**
 * Created by student on 23-Aug-16.
 */
public class AddressBookAddress {
    private String street;
    private String Postcode;
    private String city;

    // properties

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String postcode) {
        Postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //creating constructors (Methods for AddressBookAddress)

    public AddressBookAddress(String street, String postcode, String city) {
        this.street = street;
        this.Postcode = postcode;
        this.city = city;
    }


    @Override // we are overriding this method
    public String toString() {
        return String.format("AddressBookContact: %s %s %s ", this.street, this.Postcode, this.city);


    }
}
