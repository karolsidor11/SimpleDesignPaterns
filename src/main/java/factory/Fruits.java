package factory;

public enum Fruits {

    APPLE("Apple"),
    BANANA("Banana"),
    ORANGE("Orange");

    Fruits(String name) {
        this.name = name;
    }

    private String name;
}
