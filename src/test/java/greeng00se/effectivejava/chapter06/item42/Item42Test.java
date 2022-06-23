package greeng00se.effectivejava.chapter06.item42;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparingInt;

class Item42Test {

    @Test
    void test() {
        List<String> list = Arrays.asList("0123456", "water", "coffee");

        // 익명 클래스의 인스턴스를 함수 객체로 사용
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        // 람다식을 함수 객체로 사용
        Collections.sort(list, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

        // 비교자 생성 메서드 사용
        Collections.sort(list, comparingInt(String::length));

        // 메서드 참조 사용
        list.sort(comparingInt(String::length));
    }

    @Test
    void abstractTest() {
        Assertions.assertThat(useAClass(new AClass() {
            @Override
            public int apply(int i) {
                return i + i;
            }
        })).isEqualTo(10);

        Assertions.assertThat(useAClass((x) -> x + x)).isEqualTo(10);
    }

    int useAClass(AClass a) {
        return a.apply(5);
    }

}