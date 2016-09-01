package ComputerShop;

/**
 * Created by student on 26-Aug-16.
 */
public abstract class ComputerShopComputer {

    private String CPUType;// Intel or AMD
    private int RAM;//
    private double CPUSpeed;
    private int hardDrive;
    private String graphicsCardType;


    //using getter and setter


    public String getCPUType() {
        return CPUType;
    }

    public void setCPUType(String CPUType) {
        this.CPUType = CPUType;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getCPUSpeed() {
        return CPUSpeed;
    }

    public void setCPUSpeed(double CPUSpeed) {
        this.CPUSpeed = CPUSpeed;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getGraphicsCardType() {
        return graphicsCardType;
    }

    public void setGraphicsCardType(String graphicsCardType) {
        this.graphicsCardType = graphicsCardType;
    }


    // creating constructors


    //1st constructor for AddressBookPerson
    ComputerShopComputer() {

    }// default constructor for ComputerShopComputer. We have to write  this


    public ComputerShopComputer(String CPUType, int RAM, double CPUSpeed, int hardDrive, String graphicsCardType) {
        this.CPUType = CPUType;
        this.RAM = RAM;
        this.CPUSpeed = CPUSpeed;
        this.hardDrive = hardDrive;
        this.graphicsCardType = graphicsCardType;


    }






}
