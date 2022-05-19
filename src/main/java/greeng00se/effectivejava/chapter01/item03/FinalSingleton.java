package greeng00se.effectivejava.chapter01.item03;

public class FinalSingleton {
    public static final FinalSingleton INSTANCE = new FinalSingleton();

    private FinalSingleton() {}
}
