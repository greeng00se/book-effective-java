package greeng00se.effectivejava.chapter03.item24;

import java.util.function.BiFunction;

public class Calculator {

    public enum Operation {
        PLUS("+", (x, y) -> x + y),
        MINUS("-", (x, y) -> x - y);

        private String symbol;
        private BiFunction<Double, Double, Double> expression;

        Operation(String symbol, BiFunction<Double, Double, Double> expression) {
            this.symbol = symbol;
            this.expression = expression;
        }

        public double apply(double x, double y) {
            return expression.apply(x, y);
        }
    }
}
