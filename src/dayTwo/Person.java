package dayTwo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by student on 23-Aug-16.
 */
public abstract class Person { //This person class is inherited from object class
    // you define something without implementing any detail
// fields

    private String firstName;// these are fields used to define elements
    private String lastName;// we said by default these fields should be for this class only
    private Short height;// private mean available only in this class
    private double weight;
    private LocalDate birthDate;
    private SexType sex;
    //private BloodType bloodType;
    private boolean isSleeping = false;


    // properties

// They are simply methods refereed as properties sometime refer as getter and setter. gives flexibility to set and and get the values
    // public mean that it is available everywhere
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

    public Short getHeight() {
        return height;
    }

    public void setHeight(Short height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public SexType getSex() {
        return sex;
    }

    public void setSex(SexType sex) {
        this.sex = sex;
    }



    //constructors overloading
    // we created three constructor.
    // constructor is a way to instantitae object
    // every time you use new keyword (while creating objects), constructor is called
    Person() {}

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Person(String firstName, String lastName, Short height, double weight,
                  LocalDate birthDate, SexType sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.birthDate = birthDate;
        this.sex = sex;
        //this.bloodType = bloodType;
    }


    //methods  are more than constructor, called when needed

    public long getAge() {
        if(birthDate == null) {
            return 0;
        }

        long years = ChronoUnit.YEARS.between(birthDate, LocalDate.now());// ChronoUNit is a class , between is a method and
        // it calculate and returns age.
        // class soesn't know how this method work it just call it.
        return years;
    }


    public String talk() throws Exception{

        if(isSleeping)
        throw new Exception("Cannot talk while sleeping");

        return String.format("% % say hello! I am awake", this.firstName, this.lastName);

        }

     public void sleep(){
         isSleeping = true;

     }

    //every class is a subclass of a object
    //

   @Override// this is called annotation
   // here we see polymorphism
    public String toString(){
       return String.format(" Person: %s %s %s %s %s %s ", this.firstName, this.lastName,this.getAge(),this.height,
               this.weight,this.getSex().toString());
    }
}
