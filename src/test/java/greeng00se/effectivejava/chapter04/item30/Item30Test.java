package greeng00se.effectivejava.chapter04.item30;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

class Item30Test {

    @Test
    void test() {
        //List<Integer> numbers = Collections.emptyList();
        List<String> strings = Collections.emptyList();

        //numbers.add(1);
        strings.add("NAME");

        for (Object s : strings) {
            System.out.println(s);
        }
    }

    @Test
    void getMax() {
        // given
        List<Integer> list = List.of(1, 2, 3, 50, 4000);

        // when
        Integer result = GetMax.max(list);

        // then
        Assertions.assertThat(result).isEqualTo(4000);
    }
}