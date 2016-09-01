package ComputerShop;

import java.util.Scanner;

/**
 * Created by student on 26-Aug-16.
 */
public class ComputerShopMainMenu {

    static void main(String[] args){ // this is used by thw whole class

        Scanner in = new Scanner(System.in);


         char choice;

        do{
            System.out.println("Main Menu");
            System.out.println("Please type - C:  Create a new computer");
            System.out.println("Please type - N:  Create a new customer");
            System.out.println("Please type - S:  Search");
            System.out.println("Please type - M:  Match");
            System.out.println("Please type - O:  Order or otherwise sort computers");
            System.out.println("Please type - L:  List or otherwise sort computers");
            System.out.println("Please type - Q:  Quit");

        }
          while (choice );

        switch (choice){

            case 'C':
                // call the method to create a new computer

               break;
            case 'N':
                // call the method to create a new customer

                break;
            case 'S':
                // call the method to Search

                break;
            case 'M':
                // call the method to Match

                break;
            case 'O':
                // call the method to order or sort

                break;
            case 'L':

                // call the method to list
                break;


        }// switch ends




    }

}
