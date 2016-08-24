package AddressBook;

/**
 * Created by student on 23-Aug-16.
 */
public class Contact {

    private String emailAddress;
    private String phoneNumber;

    private Person p;
    private Address a;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // creating constructors
    public Contact(String emailAddress, String phoneNumber, Person p, Address a) {
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.p = p;
        this.a = a;
    }


    @Override
    public String toString() {
        return String.format("Contact: %s %s %s %s ", this.p, this.a, this.emailAddress, this.phoneNumber);

    }

}