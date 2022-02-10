import org.junit.Before;
import org.junit.Test;
import vendingmachine.Drink;
import vendingmachine.VendingMachine;

import static org.assertj.core.api.Assertions.assertThat;
import static vendingmachine.Drink.COLA;


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
        assertThat(vendingMachine.buyDrink(COLA)).isEqualTo(COLA);
    }
}
