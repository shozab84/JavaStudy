package dayTwo;


import static dayTwo.generatedPeople.people;

/**
 * Created by student on 23-Aug-16.
 */

// This is our main programme, this is where we execute from
public class MainProgramme {
    public static void main(String[] args)  throws Exception  {
        //generatedPeople.addPeople();


        //for (AddressBookPerson p : people) {
          //  System.out.println(p);


        //AddressBookCommandGUI.display();

       // generatedPeople.addPeople();
        TaskProcessing.prepareDB();
        new WelcomeWindow();


        // AddressBookTaskProcessing.executeGUI();// used with GUI
      }// end of void main
    }// end of main program




