package AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student on 23-Aug-16.
 */
public class AddressBookCommandGUI {

    static Scanner input = new Scanner(System.in);

    static void display() {
        int choice;
        do {

            System.out.println("Welcome to contact Database");
            System.out.println("1. Add an contact");
            System.out.println("2. Edit a contact");
            System.out.println("3. Remove an Employee");

             choice = input.nextInt();

        } while (choice < 1 || choice > 3);


        List<String> tempData = new ArrayList<>();
        switch (choice) {

            case 1:
                tempData = inputScreen();
               // AddressBookTaskProcessing.createemployee(tempData);

            case 2:

                //index = findFirstName();
                tempData = inputScreen();

            case 3:
               // AddressBookTaskProcessing.removeEmployee
            case 4:
                AddressBookTaskProcessing.printAll();
                display();
            case 5:
            case 6:
                break;
        }
    }
    static List<String> inputScreen() {
        List<String> employeeData = new ArrayList<>();



        input.nextLine();
        System.out.print("Enter your email AddressBookAddress: ");
        employeeData.add(input.nextLine());

        System.out.print("Enter your phone number: ");
        employeeData.add(input.nextLine());


        return employeeData;
    }

}


