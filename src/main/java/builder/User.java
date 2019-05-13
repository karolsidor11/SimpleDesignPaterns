package builder;

public class User {

    private int id;
    private String name;
    private String lastName;
    private int age;
    private String adress;

    public User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.adress = userBuilder.adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public static class UserBuilder {

        private int id;
        private String name;
        private String lastName;
        private int age;
        private String adress;

        public UserBuilder id(int id) {
            this.id = id;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder adress(String adress) {
            this.adress = adress;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
