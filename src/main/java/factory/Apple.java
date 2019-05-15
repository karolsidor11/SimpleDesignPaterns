package factory;

public class Apple extends Fruit {

    private static final String FRUIT_NAME = "Apple";

    @Override
    public String getFruitName() {
        return FRUIT_NAME;
    }
}
