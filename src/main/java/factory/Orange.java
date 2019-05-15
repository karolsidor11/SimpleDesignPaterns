package factory;

public class Orange extends Fruit {

    private static final String FRUIT_NAME = "Orange";

    @Override
    public String getFruitName() {
        return FRUIT_NAME;
    }
}
