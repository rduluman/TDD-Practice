package vendingmachine;

import java.util.Set;

public class VendingMachine {
    Set<String> products = Set.of("cola", "sprite", "fanta", "pepsi");

    public String getProduct(String product) {
        return products.contains(product) ? product : null;
    }
}
