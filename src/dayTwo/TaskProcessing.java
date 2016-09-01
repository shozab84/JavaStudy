package dayTwo;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import static dayTwo.generatedPeople.people;


/**
 * Created by student on 23-Aug-16.
 */
public class TaskProcessing {

    static employeeDB db;


    static void prepareDB() throws Exception{

        db = new employeeDB(); // this is where we connect to our data base
        db.queryAll();
    }

    static void loadData() throws SQLException {
        people.clear();
        db.queryAll();

    }


    static void newEmployee(List<String> data) throws SQLException{// this method executes on graphic
        db.addEmployee(data);
        loadData();

    }



        static void createEmployee(List<String> data) {// create Employee method

        SexType sex;

        if(data.get(7).contains("M"))
          sex = SexType.MALE;
        else
          sex =SexType.FEMALE;


            String[] dob = data.get(4).split("-"); // added new arrays for storing dob and hireDate stuff,
            // then split into YYYY, MM and DD
            // then store it into temp Employee
            String[] hireDate = data.get(7).split("-");
;
        Employee temp = new Employee(
                        data.get(0),// 0 is the index number - this represent first name
                        data.get(1),// this represent last name
                        Short.parseShort(data.get(2)),
                        Double.parseDouble(data.get(3)),
                        LocalDate.of((Integer.parseInt(dob[0])),Integer.parseInt(dob[1]),
                                Integer.parseInt((dob[2]))),
                        checkSex(data.get(5)),
                        data.get(6),
                        LocalDate.of(Integer.parseInt(hireDate[0]), Integer.parseInt(hireDate[1]),Integer.parseInt(hireDate[2])));





                        //data.get(8),


                        //LocalDate.of(Integer.parseInt(data.get(9)),
                        //Integer.parseInt(data.get(10)),
                       // Integer.parseInt(data.get(11))));


                people.add(temp);



    }

    // printing objects in our collection
    static void printAll() {
        for (Person e : people)
            System.out.println(String.format("[%s] " + e, people.indexOf(e) ));

    }


    static int searchByFirstName(String firstName) {
        for (Person p : people) {

            if (p.getFirstName().contains((firstName)))
                return people.indexOf(p);

        }
        return -1;
    }

    static void editDetails(int index, List<String> data) {
        people.get(index).setFirstName(data.get(0));
        people.get(index).setLastName(data.get(1));
        people.get(index).setHeight(Short.parseShort(data.get(2)));
        people.get(index).setWeight(Double.parseDouble(data.get(3)));
        people.get(index).setBirthDate((LocalDate.of(
                Integer.parseInt(data.get(4)),
                Integer.parseInt(data.get(5)),
                Integer.parseInt(data.get(6)))
        ));
        people.get(index).setSex(checkSex(data.get(7)));
        people.get(index).setPosition(data.get(8));
        people.get(index).setHireDate(LocalDate.of(
                Integer.parseInt(data.get(9)),
                Integer.parseInt(data.get(10)),
                Integer.parseInt(data.get(11))
        ));


    }




    static SexType checkSex(String data){
        if(data.contains("M")){
            return SexType.MALE;
        }
        else
        {
            return SexType.FEMALE;
        }
    }





static void removeEmployee(int index) {people.remove(index);}



}
