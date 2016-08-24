package dayOne.primitive;

import java.util.Scanner;

/**
 * Created by student on 22-Aug-16.
 */
public class Light {// this class can be
    static int lightSpeed = 186000;

    public static void main (String[]args) {
        System.out.println("Enter the number of days");
        Scanner input = new Scanner(System.in);
        long days = input.nextLong();


        //streams
        System.out.println("In "+ days);
        System.out.println("days light will travel about "+ lightCalculator(days) + " miles.");
    }// main ends

    static long lightCalculator(long days){

        long seconds = days * 24 * 60 *60;
        return lightSpeed* seconds;

    }

}
