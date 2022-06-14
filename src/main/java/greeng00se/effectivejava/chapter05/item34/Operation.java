package greeng00se.effectivejava.chapter05.item34;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Operation {
    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y);

    private String symbol;
    private BiFunction<Double, Double, Double> expression;

    Operation(String symbol, BiFunction<Double, Double, Double> expression) {
        this.symbol = symbol;
        this.expression = expression;
    }

    public double apply(double x, double y) {
        return expression.apply(x, y);
    }

    @Override
    public String toString() {
        return symbol;
    }

    private static final Map<String, Operation> stringToEnum =
            Stream.of(values()).collect(Collectors.toMap(Object::toString, e -> e));

    public static Optional<Operation> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }
}