package vendingmachine;

import java.util.Arrays;
import java.util.Optional;

import static java.lang.String.format;
import static java.util.Objects.requireNonNull;

public enum Drink {
    COLA("COLA"),
    FANTA("FANTA"),
    SPRITE("SPRITE"),
    PEPSI("PEPSI");

    private final String value;

    Drink(String value) {
        this.value = value;
    }

    public static Optional<Drink> get(String drinkString) {
        requireNonNull(drinkString, "Drink type is required");

        return Arrays.stream(Drink.values())
                .filter(drink -> drink.getValue().equalsIgnoreCase(drinkString))
                .findFirst();
    }

    public String getValue() {
        return value;
    }
}
