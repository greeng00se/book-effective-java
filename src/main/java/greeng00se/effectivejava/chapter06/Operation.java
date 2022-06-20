package greeng00se.effectivejava.chapter06;

import java.util.function.DoubleBinaryOperator;

public enum Operation {
    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y);

    private final String symbol;
    private final DoubleBinaryOperator expression;

    Operation(String symbol, DoubleBinaryOperator expression) {
        this.symbol = symbol;
        this.expression = expression;
    }

    public double apply(double x, double y) {
        return expression.applyAsDouble(x, y);
    }

    @Override
    public String toString() {
        return symbol;
    }
}