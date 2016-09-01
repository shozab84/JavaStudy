package ComputerShop;

import java.util.List;

/**
 * Created by student on 26-Aug-16.
 */
public class ComputerShopTaskProcessing {

    static void createDesktop(List<String> data) {// creating a  method for a new Desktop

        ComputerShopDesktop temp1 = new ComputerShopDesktop(


                data.get(0),// 0 is the index number - this represent CPU Type
                Integer.parseInt(data.get(1)),// this represent RAM
                Double.parseDouble(data.get(2)),  // cpu speed
                Integer.parseInt(data.get(3)), //hard drive
                data.get(4), // graphic
                Double.parseDouble(data.get(5)));// monitor size
    }


    static void createLaptop(List<String> data) {// creating a  method for a new laptop

        ComputerShopLaptop temp2 = new ComputerShopLaptop(


                data.get(0),// 0 is the index number - this represent CPU Type
                Integer.parseInt(data.get(1)),// this represent RAM
                Double.parseDouble(data.get(2)),  // cpu speed
                Integer.parseInt(data.get(3)), //hard drive
                data.get(4), //graphic
                data.get(5),// battery
                Double.parseDouble(data.get(6)));// weight of the laptop
     }// createLaptop method ends here


    static void createComputers() {

        .add(temp1);
        .add(temp2);
    }












    }// ComputerShopTaskProcessing class ends here



