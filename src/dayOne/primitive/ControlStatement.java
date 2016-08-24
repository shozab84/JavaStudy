package dayOne.primitive;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by student on 22-Aug-16.
 */
public class ControlStatement {

    public static void main(String[] args) {

       //seasonCheck();// calling the method
      //controlStatements();// calling the method
        //whileInfinite();
        ForLoopTest();


    }


    static void seasonCheck() {

        int month = 4;
        String season;


        if (month == 12 || month == 1 || month == 2) {
            season = "winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Spring";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Summer";
        }
        else
            season = "Bogus Month";

        System.out.println("April is the "+ season);
    }

    //creating new method for part 1: control statement exercise

    static void controlStatements() {

    //Request user to enter a number between 0 - 2000 from a command-line
        System.out.println("enter a number between 0 - 2000");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        String output = "";
        if (number <= 100)
            output = "Your number is less than or equal 100 ";

        else if (number <= 500 )

            output = "Your number is less than or equal to 500";

        else if (number <100 || number ==1000 )

            output = "Your number is less than 100- Your number is equal 1000";

         else if ( number > 1000 ) {


            output = "Your number is more than 1000 orYour number is beyond our scope";
            }
          System.out.println(output);

    }

    static void Menu() {
        try {

            char choice;
            do {

                System.out.println("Helper Menu:");
                System.out.println("1. if");
                System.out.println("2. Switch");
                System.out.println("3. while");
                System.out.println("4. do-while");
                choice = (char) System.in.read();

            }

            while (choice<'1' || choice > '4');

            switch(choice){

                case '1':
                    System.out.println("if statement use boolean condition");
                    break;

                case '2':
                    System.out.println("Switch use constant expression to compare");
                    break;
                case '3':
                    System.out.println("While is a simple loop, boolean statement");
                    break;
                case '4':
                    System.out.println("Do-while, just keep going");
                    break;


            }


        } catch (IOException e){
            System.out.println(e.getMessage());
            //System.out.println("This is not a character we needed!");

        }


    }

    static void whileInfinite() {

        int index = 0;// this is not any block


        outer:
        while (true){
            int value = ++index;// it will start with 0 then 1 and so on

            System.out.println(value);


            if (value ==5){
                System.out.println("Fount it!");
                break outer;// here you are jumping from inside if to outside while block
            }

            if (value == 10){
                break;
            }



        }


    }

    static void ForLoopTest(){
        String[] data ={"This", "is", "a", "String."};

        for (int i = 0; i<= data.length -1; i++){
            System.out.println(data[i]);
        }

        String result ="";
        //each string using s in data
        for(String s : data){
            result += String.format(s + " ");
        }
        System.out.println(result);
    }



















}