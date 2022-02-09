import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class VendingMachineTest {

    @Test()
    public void classExists() throws ClassNotFoundException {
        assertThat(Class.forName("vendingmachine.VendingMachine").getName()).isEqualTo("vendingmachine.VendingMachine");
    }
}
