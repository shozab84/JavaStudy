package dayOne.primitive;

import java.util.Scanner;

/**
 * Created by student on 22-Aug-16.
 */
public class BinaryApplications {

    public static void main ( String[] args) {

        binary();// calling binary method

    }// main ends

    static void binary(){

        System.out.println(" Please enter a binary input?");
        Scanner input = new Scanner(System.in);
        String binary = input.nextLine();
        //binary.charAt();

// input is binary lets say 0101

        int result =0, mult =1;
        //for loop use length inout string

        // start for loop from length -1

        for (int i = binary.length() -1; i >= 0;i--)
        {

            if (binary.charAt(i) == '1')
                result += mult;
                mult =mult * 2;


        }
        System.out.println("Decimal value: "+ result);

    }



}
