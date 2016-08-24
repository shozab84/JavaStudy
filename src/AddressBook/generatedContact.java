package AddressBook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 23-Aug-16.
 */
public class generatedContact {
    public static Contact con1 = new Contact("shozab.rizvi84@gmail.com", "07734866219",
            new Person("Shozab", "Rizvi"),
            new Address("76 Longley Road", "HA1 4TQ", "London"));

    public static Contact con2 = new Contact("haani89@gmail.com", "07734855236",
            new Person("Haani", "Rizvi"),
            new Address("17 Hooking Green", "HA2 6AD", "London"));


    public static List<Contact> people = new ArrayList<>(); // what does this line do???

    static void addPeople() {

        people.add(con1);
        people.add(con2);
    }
}
