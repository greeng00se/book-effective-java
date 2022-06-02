package greeng00se.effectivejava.chapter03.item24;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class Item24Test {

    @Test
    void calculator() {
        double plus = Calculator.Operation.PLUS.apply(1.0, 2.0);
        double minus = Calculator.Operation.MINUS.apply(1.0, 2.0);

        Assertions.assertThat(plus).isEqualTo(3.0);
        Assertions.assertThat(minus).isEqualTo(-1.0);
    }

    @Test
    void printer() {
        AnonymousPrinter anonymousPrinter = new AnonymousPrinter(1, 2);
        anonymousPrinter.printer.run();
    }

    @Test
    void map() {
        Map<Integer, String> map = new HashMap<>();
    }
}