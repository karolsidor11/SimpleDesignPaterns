package factory;

public class FruitFactory {

    public Fruit produce(String fruit) {
        Fruit actualFruit;

        if (fruit.equals("Apple")) {
            actualFruit = new Apple();
        } else if (fruit.equals("Banana")) {
            actualFruit = new Banana();

        } else if (fruit.equals("Orange")) {
            actualFruit = new Orange();
        } else {
            actualFruit = new Fruit();
        }
        return actualFruit;
    }
}
