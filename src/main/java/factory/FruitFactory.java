package factory;

public class FruitFactory {

    public Fruit produce(String fruit) {
        Fruit fruit1 = null;

        if (fruit.equals("Apple")) {
            fruit1 = new Apple();
        } else if (fruit.equals("Banana")) {
            fruit1 = new Banana();

        } else if (fruit.equals("Orange")) {
            fruit1 = new Orange();
        } else {
            fruit1 = new Fruit();
        }
        return fruit1;
    }
}
