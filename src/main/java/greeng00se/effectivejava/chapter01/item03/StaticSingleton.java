package greeng00se.effectivejava.chapter01.item03;

public class StaticSingleton {
    private static final StaticSingleton INSTANCE = new StaticSingleton();

    private StaticSingleton() {}

    public static StaticSingleton getInstance() {
        return INSTANCE;
    }
}
