package AddressBook;

/**
 * Created by student on 23-Aug-16.
 */
public class Person {
    private String firstName;
    private String lastName;


    // properties
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    // creating constructors (Methods)


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;


    }

    @Override // we are overriding those method
    public String toString() {
        return String.format("Person: %s %s ", this.firstName, this.lastName);

    }
}






