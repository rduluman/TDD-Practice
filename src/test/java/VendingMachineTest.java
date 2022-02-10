import org.junit.Test;
import vendingmachine.VendingMachine;

import static org.assertj.core.api.Assertions.assertThat;


public class VendingMachineTest {

    @Test()
    public void classExists() throws ClassNotFoundException {
        assertThat(Class.forName("vendingmachine.VendingMachine").getName()).isEqualTo("vendingmachine.VendingMachine");
    }

    @Test()
    public void getProduct() {
        VendingMachine vendingMachine = new VendingMachine();
        assertThat(vendingMachine.getProduct("cola")).isEqualTo("cola");
    }
}
