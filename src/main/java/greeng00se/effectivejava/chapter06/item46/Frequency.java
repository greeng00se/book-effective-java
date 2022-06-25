package greeng00se.effectivejava.chapter06.item46;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Frequency {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("TOKEN", "token", "method");

        // 스트림 코드를 가장한 반복적 코드
        Map<String, Long> freq = new HashMap<>();
        list.stream().forEach(
                word -> freq.merge(word.toLowerCase(), 1L, Long::sum)
        );

        // 짧고 명확한 스트림 사용 예시
        Map<String, Long> frequency = list.stream()
                .collect(groupingBy(String::toLowerCase, counting()));

        frequency.keySet().stream()
                .sorted(comparing(frequency::get).reversed())
                .limit(10)
                .forEach(key -> System.out.println(key +": " + frequency.get(key)));
    }
}
