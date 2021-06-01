package factory;

import static factory.Fruits.*;

public class FruitFactory {

    public Fruit produce(String fruit) {
        Fruit actualFruit;

        if (APPLE.name().equalsIgnoreCase(fruit)) {
            actualFruit = new Apple();
        } else if (BANANA.name().equalsIgnoreCase(fruit)) {
            actualFruit = new Banana();
        } else if (ORANGE.name().equalsIgnoreCase(fruit)) {
            actualFruit = new Orange();
        } else {
            actualFruit = new Fruit();
        }
        return actualFruit;
    }
}
