package dayOne.primitive;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by student on 22-Aug-16.
 */
public class Task3 {

    public static void main(String[] args) {

        iceCream();// calling th method

    }


    static void iceCream() {


            System.out.println(" what size of ice-cream cone they like?");
            System.out.println("Press 1 for Small");
            System.out.println("Press 2 for Medium");
            System.out.println("Press 3 for Large");
            System.out.println("Press 4 for Huge");
            Scanner input = new Scanner(System.in);
            String size = input.next();

            switch (size) {

                case "1":

                    System.out.println("The price of small size cone is £1.25");
                    break;
                case "2":

                    System.out.println("The price of medium size cone is £2.25");
                    break;
                case "3":

                    System.out.println("The price of large size cone is £3.25");
                    break;
                case "4":

                    System.out.println("The price of huge size cone is £4");
                    break;


            }






    }
}
