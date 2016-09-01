package ComputerShop;

/**
 * Created by student on 26-Aug-16.
 */
public class ComputerShopLaptop extends ComputerShopComputer {

    private String battery;// type of Laptop batteries are Lithium-ion, Nickel-cadmium (NiCad) and nickel-metal hydride (NiMH).
    private double weight; // Most laptop manufacturers include lightweight versions in their offering,
                           // which tend to weigh between 1 kg and 2.7 kg (2 lb and 6 lbs



    //adding constructors

    ComputerShopLaptop() {}// its a requirement to declare default constructor

    public ComputerShopLaptop(String CPUType, int RAM, double CPUSpeed, int hardDrive, String graphicsCardType,
                              String battery, double weight) {


        super(CPUType, RAM, CPUSpeed,hardDrive, graphicsCardType);
        this.battery = battery;
        this.weight = weight;
    }

    // using getter setter


    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }






}
