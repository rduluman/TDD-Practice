import org.junit.Test;
import vendingmachine.VendingMachine;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;


public class VendingMachineTest {

    Set<String> validProducts = Set.of("cola", "sprite", "fanta", "pepsi");

    @Test()
    public void classExists() throws ClassNotFoundException {
        assertThat(Class.forName("vendingmachine.VendingMachine").getName()).isEqualTo("vendingmachine.VendingMachine");
    }

    @Test()

    public void verifyCorrectProductIsReturned() {
        VendingMachine vendingMachine = new VendingMachine();
        validProducts.forEach(product -> assertThat(vendingMachine.getProduct(product)).isEqualTo(product));
    }

    @Test
    public void verifyInvalidInputsReturnBlank() {
        VendingMachine vendingMachine = new VendingMachine();
        assertThat(vendingMachine.getProduct("elefant")).isBlank();
    }
}
