package vendingmachine;

import java.util.Optional;

public class VendingMachine {

    public Optional<Drink> buyDrink(String drink) {
        return Drink.get(drink);
    }

}
