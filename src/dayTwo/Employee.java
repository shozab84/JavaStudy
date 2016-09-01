package dayTwo;

import java.time.LocalDate;

/**
 * Created by student on 23-Aug-16.
 */

// Employee is a AddressBookPerson (AddressBookPerson is a superclass of employee)
public class Employee extends Person {// extends now inherit- first name, last name, date

    private String position;
    private LocalDate hireDate;

    Employee() {}// its a requirement to declare default constructor

    public Employee(String firstName, String lastName, Short height, double weight, LocalDate birthDate,
                    SexType sex, String position, LocalDate hireDate) {


        super(firstName, lastName, weight,height, birthDate, sex);
        this.position = position;
        this.hireDate = hireDate;
    }







    // using setter

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;

    }

    @Override
    public String toString() {
        return String.format("%s %s %s", super.toString(),this.position,this.hireDate);
    }



}
