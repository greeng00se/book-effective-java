package greeng00se.effectivejava.chapter01.item03;

public class LazySingleton {

    private static LazySingleton INSTANCE = null;

    private LazySingleton() {
    }
    
    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
