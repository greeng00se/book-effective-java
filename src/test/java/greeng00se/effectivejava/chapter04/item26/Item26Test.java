package greeng00se.effectivejava.chapter04.item26;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

class Item26Test {

    @Test
    @DisplayName("로타입을 사용할 경우 컴파일 시 오류를 발생하지 않고 런타임 시 발생한다.")
    void useRawType() {
        // given
        Collection strings = new ArrayList();

        // when
        strings.add("Hello");
        strings.add(5);

        // then
        Assertions.assertThatThrownBy(() -> {
            for (Iterator i = strings.iterator(); i.hasNext(); ) {
                String string = (String) i.next();
            }
        }).isInstanceOf(ClassCastException.class);
    }

    @Test
    void test() {
        List<Integer> list = new ArrayList<>();
        list.add(42);
        printWildcard(list);
        printGeneric(list);
    }

    // List<?> 는 List<? extends Object>와 같다.
    static void printWildcard(List<?> list) {
        // null을 제외한 어떤 원소도 넣을 수 없다. 타입 불변식을 보장한다.
        // list.add(list.get(0));
        // null은 추가 할 수 있다.
        list.add(null);
        for (Object o : list) {
            System.out.println(o);
        }
    }

    static void printBoundedWildcard(List<? extends Integer> list) {
        if (list instanceof Set) {

        }
    }

    static <T> void printGeneric(List<T> list) {
        // T 타입의 값은 추가할 수 있다.
        if (list instanceof List<?>) {
            List<?> d = (List<?>) list;
        }
        list.add(list.get(0));
        // null도 추가할 수 있다.
        list.add(null);
        for (T t : list) {
            System.out.println(t);
        }
    }
}