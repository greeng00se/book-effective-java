package greeng00se.effectivejava.chapter05.item38;

public enum BasicOperation implements Operation {
    PLUS("+") {
        public double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        public double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
        public double apply(double x, double y) { return x / y; }
    },;

    @Override
    public String toString() {
        return symbol;
    }

    private final String symbol;

    BasicOperation(String symbol) {
        this.symbol = symbol;
    }
}
