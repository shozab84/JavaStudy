package ComputerShop;

/**
 * Created by student on 26-Aug-16.
 */
public class ComputerShopDesktop extends ComputerShopComputer {

    private double monitorSize;

    //adding constructors

    ComputerShopDesktop (){} // default constructor

    public ComputerShopDesktop(String CPUType, int RAM, double CPUSpeed, int hardDrive,
                               String graphicsCardType,double monitorSize) {


        super(CPUType, RAM, CPUSpeed,hardDrive, graphicsCardType);
        this.monitorSize = monitorSize;

    }


    // using getter and setter


    public double getMonitorSize() {
        return monitorSize;
    }

    public void setMonitorSize(double monitorSize) {
        this.monitorSize = monitorSize;
    }



    public static List<>  = new ArrayList<>();







}
