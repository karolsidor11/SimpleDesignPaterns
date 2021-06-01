package singleton;

public class SimpleSingleton {

    private static SimpleSingleton instance = null;

    private SimpleSingleton() {
    }

    public static synchronized SimpleSingleton getInstance() {
        if (instance == null) {
            return instance = new SimpleSingleton();
        }
        return instance;
    }
}
