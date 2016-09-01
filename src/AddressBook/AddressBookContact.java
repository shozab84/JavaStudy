package AddressBook;

/**
 * Created by student on 23-Aug-16.
 */
public class AddressBookContact {

    private String emailAddress;
    private String phoneNumber;

    private AddressBookPerson p;
    private AddressBookAddress a;

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
    public AddressBookContact(String emailAddress, String phoneNumber, AddressBookPerson p, AddressBookAddress a) {
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.p = p;
        this.a = a;
    }


    @Override
    public String toString() {
        return String.format("AddressBookContact: %s %s %s %s ", this.p, this.a, this.emailAddress, this.phoneNumber);

    }

}