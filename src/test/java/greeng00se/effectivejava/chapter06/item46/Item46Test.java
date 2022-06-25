package greeng00se.effectivejava.chapter06.item46;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static org.assertj.core.api.Assertions.assertThat;

class Item46Test {

    @Test
    @DisplayName("1부터 9까지 제곱을 값으로 가지는 맵 생성")
    void toMapTest() {
        Map<Integer, Integer> squareMap = new HashMap<>();
        for (int i = 1; i < 10; i++) {
            squareMap.put(i, i * i);
        }

        Map<Integer, Integer> result = IntStream.range(1, 10)
                .boxed()
                .collect(Collectors.toMap(Function.identity(), i -> i * i));

        assertThat(result).isEqualTo(squareMap);
    }

    @Test
    @DisplayName("1의 자리 숫자로 그룹을 생성")
    void groupingByTest() {
        List<Integer> list = Arrays.asList(1, 2, 3, 100, 123);

        Map<Integer, Long> collect = list.stream()
                .collect(groupingBy(i -> i % 10, counting()));

        assertThat(collect.get(3)).isEqualTo(2);
    }

    @Test
    @DisplayName("스페이스바를 단어 사이에 넣어준다.")
    void joiningTest() {
        List<String> list = Arrays.asList("안녕", "오늘도", "수고했어");
        String collect = list.stream().
                collect(Collectors.joining(" "));

        assertThat(collect).isEqualTo("안녕 오늘도 수고했어");
    }

}