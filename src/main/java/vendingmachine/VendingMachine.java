package vendingmachine;

import java.util.Set;

public class VendingMachine {
    Set<String> products = Set.of("cola", "sprite", "fanta", "pepsi");
    int money;

    public String getProduct(String product) {
        return products.contains(product) ? product : null;
    }

    public void addMoney(int userMoney) {
        money = userMoney;
    }

    public int getMoney() {
        return money;
    }
}
