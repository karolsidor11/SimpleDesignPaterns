package factory;

public class Apple extends Fruit {

    @Override
    public String getFruitName() {
        return Fruits.APPLE.name();
    }
}
