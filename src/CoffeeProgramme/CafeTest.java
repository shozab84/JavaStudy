package CoffeeProgramme;

/**
 * Created by student on 26-Aug-16.
 */

import org.junit.*;



public class CafeTest {

    public static final int NO_MILK = 0;
    public static final int No_BEANS = 0;
    public static final int ESPRESSO BEANS = CoffeeType.Espresso.getRequiredBeans();


    private Cafe cafe;


    @Before
    public void before() {
        cafe = new Cafe();

    }


    @Test
    public void canBrewEspresso(){

        //Given
        withBeans();

        //WHEN

        Coffee coffee =cafe.brew(CoffeeType.Espresso);


        //THEN
        //1-- Is it espresso
        Assert.assertEquals("Wrong coffee type", coffeeType.Espresso, coffee.getType());



    }



    public void withBeans() {

        cafe.restockbeans(ESPRESSO_BEANS);
    }



}
