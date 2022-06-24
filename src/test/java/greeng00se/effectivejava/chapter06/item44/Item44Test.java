package greeng00se.effectivejava.chapter06.item44;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.*;

import static org.assertj.core.api.Assertions.assertThat;

public class Item44Test {

    @Test
    void operator() {
        UnaryOperator<String> unaryOperator = String::toLowerCase;
        assertThat(unaryOperator.apply("APPLE")).isEqualTo("apple");

        BinaryOperator<Integer> binaryOperator = Integer::max;
        assertThat(binaryOperator.apply(5, 10)).isEqualTo(10);
    }

    @Test
    void predicate() {
        Predicate<Collection> predicate = Collection::isEmpty;
        assertThat(predicate.test(new ArrayList())).isTrue();

        // 표준 함수형 인터페이스는 각각 int, long, double 변형이 존재한다.
        IntPredicate intPredicate = x -> x < 5;
        assertThat(intPredicate.test(10)).isFalse();

        // 인수를 두 개 받는 변형
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x + y < 10;
        assertThat(biPredicate.test(3, 4)).isTrue();
    }

    @Test
    void function() {
        Function<String, Integer> function = Integer::valueOf;
        assertThat(function.apply("15")).isEqualTo(15);

        // double을 받아 int를 반환하는 변형
        DoubleToIntFunction doubleToIntFunction = x -> (int) x;
        assertThat(doubleToIntFunction.applyAsInt(23.45)).isEqualTo(23);
    }

    @Test
    void supplier() {
        Supplier supplier = () -> 5000L;
        assertThat(supplier.get()).isEqualTo(5000L);

        BooleanSupplier booleanSupplier = () -> false;
        assertThat(booleanSupplier.getAsBoolean()).isFalse();
    }

    @Test
    void consumer() {
        Consumer consumer = System.out::println;
        consumer.accept("HELLO WORLD");

        // 객체와 기본 타입을 받는 변형
        ObjIntConsumer objIntConsumer = (x, y) -> System.out.println(x + " " + y);
        objIntConsumer.accept("Hello", 365);
    }
}
