package builder;

public class Main {

    public static void main(String[] args) {

        User user = new User.Builder()
                .id(1)
                .name("Jan")
                .lastName("Kowalski")
                .age(25)
                .address("Lublin")
                .build();

        System.out.println(String.format("User %s %s ", user.getName(), user.getLastName()));
    }
}
