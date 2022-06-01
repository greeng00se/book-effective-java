package greeng00se.effectivejava.chapter03.item18;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Item18Test {

    @Test
    @DisplayName("원소의 갯수를 3을 반환해야하지만, 실제로는 6을 반환한다.")
    void countTest() {
        CountHashSet<String> s = new CountHashSet<>();
        s.addAll(List.of("Orange", "Apple", "Banana"));

        assertThat(s.getAddCount()).isEqualTo(6);
    }
}
