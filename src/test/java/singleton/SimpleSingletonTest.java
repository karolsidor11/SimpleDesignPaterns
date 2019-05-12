package singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleSingletonTest {

    private SimpleSingleton simpleSingleton;

    @BeforeEach
    void setUp() {
        simpleSingleton = SimpleSingleton.getInstance();
    }

    @Test
    void getInstance() {
        // given:
        String name = "Karol";

        //when:
        simpleSingleton.singletonName = name;

        //  then:
        assertEquals("Karol", simpleSingleton.singletonName);
    }
}