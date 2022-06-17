package greeng00se.effectivejava.chapter05.item38;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class Item38Test {

    @Test
    @DisplayName("Operation 인터페이스를 사용하는 메서드를 호출 한다면, 새로 만든 열거 타입도 사용할 수 있다.")
    void opTest() {
        // given
        double x = 3.0;
        double y = 2.0;

        // when
        List<Double> boResult = getResult(Arrays.asList(BasicOperation.values()), x, y);
        List<Double> eoResult = getResult(Arrays.asList(ExtendedOperation.values()), x, y);

        // then
        assertThat(boResult).containsExactly(5.0, 1.0, 6.0, 1.5);
        assertThat(eoResult).containsExactly(9.0, 1.0);
    }

    private static List<Double> getResult(Collection<? extends Operation> opSet, double x, double y) {
        List<Double> result = opSet.stream()
                .map((op) -> op.apply(x, y))
                .collect(Collectors.toList());

        return result;
    }

}