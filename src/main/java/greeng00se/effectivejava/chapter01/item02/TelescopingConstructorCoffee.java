package greeng00se.effectivejava.chapter01.item02;

public class TelescopingConstructorCoffee {

    private int size;
    private int water;
    private boolean iced;

    public TelescopingConstructorCoffee(int size) {
        this(size, 0);
    }

    public TelescopingConstructorCoffee(int size, int water) {
        this(size, water, false);
    }

    public TelescopingConstructorCoffee(int size, int water, boolean iced) {
        this.size = size;
        this.water = water;
        this.iced = iced;
    }
}
