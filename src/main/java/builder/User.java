package builder;

public class User {

    private int id;
    private String name;
    private String lastName;
    private int age;
    private String adress;

    User(Builder userBuilder) {
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

    public static class Builder {

        private int id;
        private String name;
        private String lastName;
        private int age;
        private String adress;

        public  Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder adress(String adress) {
            this.adress = adress;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
