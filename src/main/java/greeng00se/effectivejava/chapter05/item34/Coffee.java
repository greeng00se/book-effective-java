package greeng00se.effectivejava.chapter05.item34;

public enum Coffee {
    ARABICA(5000, 1.4),
    ROBUSTA(6000, 4.0),
    LIBERICA(8000, 1.2);

    private final int price;
    private final double caffeine;

    Coffee(int price, double caffeine) {
        this.price = price;
        this.caffeine = caffeine;
    }

    @Override
    public String toString() {
        return this.name() + ": " + price;
    }
}