package greeng00se.effectivejava.chapter06.item47;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class Item47Test {

    @Test
    @DisplayName("원소 개수가 n개인 경우 멱집합의 원소 개수는 2^n개가 된다.")
    void powerSetTest() {
        // given
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList("1", "2", "3"));

        // when
        Collection<Set<String>> powerSet = PowerSet.of(set);

        // then
        assertThat(powerSet.size()).isEqualTo((int) Math.pow(2, set.size()));
    }

}