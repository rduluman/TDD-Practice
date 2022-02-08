import org.junit.Test;

public class VendingMachineTest {

    @Test(expected = ClassNotFoundException.class)
    public void classExists() throws ClassNotFoundException {
        Class.forName("vendingmachine.VendingMachine");
    }
}
