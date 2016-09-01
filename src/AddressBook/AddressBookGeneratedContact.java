package AddressBook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 23-Aug-16.
 */
public class AddressBookGeneratedContact {
    public static AddressBookContact con1 = new AddressBookContact("shozab.rizvi84@gmail.com", "07734866219",
            new AddressBookPerson("Shozab", "Rizvi"),
            new AddressBookAddress("76 Longley Road", "HA1 4TQ", "London"));

    public static AddressBookContact con2 = new AddressBookContact("haani89@gmail.com", "07734855236",
            new AddressBookPerson("Haani", "Rizvi"),
            new AddressBookAddress("17 Hooking Green", "HA2 6AD", "London"));


    public static List<AddressBookContact> people = new ArrayList<>(); // what does this line do???

    static void addPeople() {

        people.add(con1);
        people.add(con2);
    }
}
