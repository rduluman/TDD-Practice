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

    @Test
    public void verifyUserCanInsertMoney() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addMoney(5);
        assertThat(vendingMachine.getMoney()).isNotNull();
    }

    @Test
    public void verifyVendingMachineHasCorrectAmountOfMoney() {
        VendingMachine vendingMachine = new VendingMachine();
        int randomValue = (int) (Math.random() * 10);
        vendingMachine.addMoney(randomValue);
        assertThat(vendingMachine.getMoney()).isEqualTo(randomValue);
    }

    @Test
    public void verifyVendingMachineHasAddsUpMoney() {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.addMoney(5);
        vendingMachine.addMoney(10);
        assertThat(vendingMachine.getMoney()).isEqualTo(15);
    }
}
