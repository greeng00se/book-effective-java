package greeng00se.effectivejava.chapter08.item58;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Item58Test {

    @Test
    @DisplayName("for-each를 사용해봅시다.")
    void _1() {
        List<String> list = List.of("a", "b", "c");

        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test
    @DisplayName("리스트나 배열을 순회하면서 원소의 값을 교체해야 하는 경우 for-each는 사용하지 못한다.")
    void _2() {
        List<String> list = new ArrayList<>();
        list.add("string");
        list.add("string2");

        for (String s : list) {
            s = "string3";
        }

        assertThat(list).containsExactly("string", "string2");
    }
}
