package factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FruitFactoryTest {

    private FruitFactory fruitFactory;

    @BeforeEach
    void setUp() {
        fruitFactory = new FruitFactory();
    }

    @Test
    public void shouldCreateApple() {

        // given:
        String fruit = "Apple";

        // when:
        Fruit produce = fruitFactory.produce(fruit);

        //  then:
        assertEquals("Apple", produce.getFruitName());
        assertEquals("factory.Apple", produce.getClass().getName());
    }

    @Test
    public void shouldCreateBanana() {
        // given:
        String fruit = "Banana";

        // when:
        Fruit produce = fruitFactory.produce(fruit);

        //  then:
        assertEquals("Banana", produce.getFruitName());
        assertEquals("factory.Banana", produce.getClass().getName());
    }

    @Test
    public void shouldCreateOrange() {
        // given:
        String fruit = "Orange";

        // when:
        Fruit produce = fruitFactory.produce(fruit);

        //  then:
        assertEquals("Orange", produce.getFruitName());
        assertEquals("factory.Orange", produce.getClass().getName());
    }

    @Test
    public void shouldCreateBFruit() {
        // given:
        String fruit = "Fruit";

        // when:
        Fruit produce = fruitFactory.produce(fruit);

        //  then:
        assertEquals("No name", produce.getFruitName());
        assertEquals("factory.Fruit", produce.getClass().getName());
    }

}