package greeng00se.effectivejava.chapter05;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class Item34Test {

    @Test
    void operationTest() {
        Optional<Operation> operation = Operation.fromString("+");
        double result = operation.get().apply(1, 2);
        Assertions.assertThat(result).isEqualTo(3.0);

        Operation plus = Operation.valueOf("PLUS");
        double result2 = plus.apply(6, -3);
        Assertions.assertThat(result).isEqualTo(result2);
    }

    @Test
    void coffeeTest() {
        Coffee arabica = Coffee.ARABICA;
        System.out.println(arabica); // ARABICA: 5000
        Coffee robusta = Coffee.valueOf("ROBUSTA");
        System.out.println(robusta);
    }
}