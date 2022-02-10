import org.junit.Before;
import org.junit.Test;
import vendingmachine.Drink;
import vendingmachine.VendingMachine;

import static org.assertj.core.api.Assertions.assertThat;
import static vendingmachine.Drink.COLA;
import static vendingmachine.Drink.FANTA;
import static vendingmachine.Drink.PEPSI;
import static vendingmachine.Drink.SPRITE;


public class VendingMachineTest {

    private VendingMachine vendingMachine;

    @Before
    public void init() {
        vendingMachine = new VendingMachine();
    }

    @Test()
    public void classExists() throws ClassNotFoundException {
        assertThat(Class.forName("vendingmachine.VendingMachine").getName()).isEqualTo("vendingmachine.VendingMachine");
    }

    @Test()
    public void givenColaIsSelected_then_colaIsReturned() {
        assertThat(vendingMachine.buyDrink("COLA")).contains(COLA);
    }

    @Test()
    public void givenFantaIsSelected_then_fantaIsReturned() {
        assertThat(vendingMachine.buyDrink("FANTA")).contains(FANTA);
    }

    @Test()
    public void givenSpriteIsSelected_then_spriteIsReturned() {
        assertThat(vendingMachine.buyDrink("SPRITE")).contains(SPRITE);
    }

    @Test()
    public void givenPepsiIsSelected_then_pepsiIsReturned() {
        assertThat(vendingMachine.buyDrink("PEPSI")).contains(PEPSI);
    }

    @Test()
    public void givenDummyDrinkIsSelected_then_nothingIsReturned() {
        assertThat(vendingMachine.buyDrink("ADRIA")).isEmpty();
    }
}
