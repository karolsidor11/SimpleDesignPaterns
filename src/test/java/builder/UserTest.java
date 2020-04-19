package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserTest {

    @Test
    public void shouldBuildUser() {

        // given:
        int id = 1;
        String name = "Karol";
        String lastName = "Sidor";
        int age = 27;
        String adress = "Garbów";

        // when:
        User user = new User.Builder()
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