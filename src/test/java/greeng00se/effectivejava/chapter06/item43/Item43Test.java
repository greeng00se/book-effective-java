package greeng00se.effectivejava.chapter06.item43;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;

public class Item43Test {

    @Test
    void test() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(3, 2);

        for (int key = 0; key <= 3; key++) {
            map.merge(key, 1, Integer::sum);
        }

        for (Integer integer : map.keySet()) {
            System.out.println(map.get(integer));
        }
    }

    @Test
    @DisplayName("Function.identity()를 사용하는 것보다 람다를 사용하는 것이 짧다.")
    void codeLength() {
        Arrays.asList(1, 2, 3).stream()
                .map(x -> x)
                .map(Function.identity())
                .forEach(System.out::println);
    }

    @Test
    void methodReferencesTest() {
        // static 메서드 참조
        Function<String, Integer> f = Integer::parseInt;
        assertThat(f.apply("150")).isEqualTo(150);

        // 인스턴스 메서드 참조
        BiFunction<String, String, Boolean> b = String::equals;
        BiFunction<String, String, Boolean> b2 = (s1, s2) -> s1.equals(s2);
        assertThat(b.apply("Hello", "World")).isFalse();

        // 특정 객체 인스턴스 메서드 참조
        String emptyString1 = new String();
        Supplier<Boolean> s1 = emptyString1::isEmpty;
        assertThat(s1.get()).isTrue();

        Supplier<String> s3 = () -> new String();
        // 생성자 참조
        Supplier<String> s2 = String::new;
        String emptyString2 = s2.get();
        assertThat(emptyString2).isEmpty();


        Integer.sum()
    }
}
