package AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student on 23-Aug-16.
 */
public class CommandGUI {

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
               // TaskProcessing.createemployee(tempData);

            case 2:

                //index = findFirstName();
                tempData = inputScreen();

            case 3:
               // TaskProcessing.removeEmployee
            case 4:
                TaskProcessing.printAll();
                display();
            case 5:
            case 6:
                break;
        }
    }
    static List<String> inputScreen() {
        List<String> employeeData = new ArrayList<>();



        input.nextLine();
        System.out.print("Enter your email Address: ");
        employeeData.add(input.nextLine());

        System.out.print("Enter your phone number: ");
        employeeData.add(input.nextLine());


        return employeeData;
    }

}


