package greeng00se.effectivejava.chapter01.item03;

public enum EnumSingleton {
    INSTANCE;

    void doSomething() {
        System.out.println("Enum");
    }
}
