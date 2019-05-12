package singleton;

public class SimpleSingleton {

    private static SimpleSingleton instance = null;
    public String singletonName;

    private SimpleSingleton() {

    }

    public static synchronized SimpleSingleton getInstance() {
        if (instance == null)
            instance = new SimpleSingleton();

        return instance;
    }
}
