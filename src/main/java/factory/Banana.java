package factory;

public class Banana extends Fruit {

    private static final String FRUIT_NAME = "Banana";

    @Override
    public String getFruitName() {
        return FRUIT_NAME;
    }
}
