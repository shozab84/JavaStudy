package dayTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static dayTwo.generatedPeople.people;

/**
 * Created by student on 23-Aug-16.
 */
public class CommandGUI {

    static Scanner input = new Scanner(System.in);// Scanner is a class, created as a object to deal with input

    static void display() {// our method display all output
        int choice; //
        do {

            System.out.println("Welcome to employee Database");
            System.out.println("1. Add an Employee");
            System.out.println("2. Edit an Employee");
            System.out.println("3. Remove an Employee");
            System.out.println("4. List all employee");
            System.out.println("5. Search by First Name");
            System.out.println("6. Terminate");
            System.out.println();
            System.out.println("Enter between (1-6): ");

            choice = input.nextInt();// saving the input in a variable choice, next method

        } while (choice < 1 || choice > 6);

        int index;

        List<String> tempData = new ArrayList<>(); // tempData is used to collect temporary data
        switch (choice) {

            case 1:
                tempData = inputScreen();//inputScreen is method
                TaskProcessing.createEmployee(tempData);
                display();// recursive; we give the user same display again


            case 2:
                index = findfirstName();
                tempData = inputScreen();
                TaskProcessing.editDetails(index, tempData);

            case 3:

                TaskProcessing.removeEmployee(requestIndex());
                display();
            case 4:
                TaskProcessing.printAll();
                display();
            case 5:

                index = findfirstName();
                System.out.println(people.get(index));
                display();
            case 6:
                break;
        }
    }
        static List<String> inputScreen() {
            List<String> employeeData = new ArrayList<>(); //employeeData is another collection



            input.nextLine();
            System.out.print("Enter First Name: ");
            employeeData.add(input.nextLine());// we are collecting all details user inputs

            System.out.print("Enter Last Name: ");
            employeeData.add(input.nextLine());

            System.out.print("Enter height Name: ");
            employeeData.add(input.nextLine());

            System.out.print("Enter weight: ");
            employeeData.add(input.nextLine());

            System.out.print("Enter DOB (YYYY/MM/DD: ");
            String dob = input.nextLine();
            String[] dobData =  dob.split("/");

             for (int i = 0; i <= dobData.length - 1; i++) {
                employeeData.add(dobData[i]);
            }

            System.out.print("Enter Sex M/F: ");
            employeeData.add(input.nextLine());

            System.out.print("Enter Position: ");
            employeeData.add(input.nextLine());

            System.out.print("Enter hire Date (YYYY/MM/DD: ");

            String hireDate = input.nextLine();
            String[] hireData =  hireDate.split("/");

            for (int i = 0; i <= hireData.length - 1; i++) {
                employeeData.add(hireData[i]);
            }

            return employeeData;
        }


    static int findfirstName(){

        System.out.print("Enter first name:");
        String firstname = input.next();
        return TaskProcessing.searchByFirstName(firstname);

    }

    static int requestIndex(){

        System.out.print("Enter Employee index to remove: ");
        return input.nextInt();
    }


    }


