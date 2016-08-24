package dayTwo;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by student on 23-Aug-16.
 */
public class generatedPeople {
    /*
    public static Person dana = new Person ("Dana", "Scully", (short)160, 52.5, LocalDate.of(1968, 9, 9), SexType.FEMALE
            );

    public static Person alex = new Person("Alex", "Kennedy", (short)180, 78.90, LocalDate.of(1983, 4, 16), SexType.MALE
            );




    */

    public  static Employee fox = new Employee("Fox","Muller",(short)185, 78.90,LocalDate.of(1983, 4, 16), SexType.MALE, "FBI Agent",LocalDate.of(1983, 4, 16) );
    public static List<Employee> people = new ArrayList<>(); // what does this line do???


    static void addPeople() {

       // people.add(alex);
        people.add(fox);
    }






}
