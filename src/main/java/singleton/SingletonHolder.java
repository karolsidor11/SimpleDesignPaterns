package singleton;

public class SingletonHolder {

    private SingletonHolder() {
    }

    public static SingletonHolder getInstance() {
        return SingletonInstance.instance;
    }

    private static class SingletonInstance {
        private static final SingletonHolder instance = new SingletonHolder();
    }
}
