package builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
    }


    @Test
    public void shouldBuildUser() {

        // given:
        Integer id = 1;
        String name = "Karol";
        String lastName = "Sidor";
        Integer age = 27;
        String adress = "Garbów";

        // when:
        user = new User.Builder()
                .id(id)
                .name(name)
                .lastName(lastName)
                .age(age)
                .adress(adress)
                .build();


        // then:
        assertNotNull(user);
        assertEquals(id, user.getId());
        assertEquals(name, user.getName());
        assertEquals(lastName, user.getLastName());
        assertEquals(age, user.getAge());
        assertEquals(adress, user.getAdress());
    }

}