package greeng00se.effectivejava.chapter08.item61;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

public class Item61Test {

    @Test
    @DisplayName("0을 출력하는 것으로 기대했지만 2번째 비교시 참조값을 비교하기 때문에 결과가 1이 나온다.")
    void _1() {
        Comparator<Integer> naturalOrder =
                (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1);

        int result = naturalOrder.compare(new Integer(42), new Integer(42));

        assertThat(result).isNotEqualTo(0);
    }

    @Test
    @DisplayName("언박싱을 먼저 해야한다.")
    void _2() {
        Comparator<Integer> naturalOrder = (iBoxed, jBoxed) -> {
            int i = iBoxed, j = jBoxed;
            return (i < j) ? -1 : (i == j ? 0 : 1);
        };

        int result = naturalOrder.compare(new Integer(42), new Integer(42));

        assertThat(result).isEqualTo(0);
    }

}
