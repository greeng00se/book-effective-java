package greeng00se.effectivejava.chapter03.item16;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Item16Test {

    @Test
    @DisplayName("고양이는 -1살이 될 수 없다.")
    void cat() {
        Assertions.assertThatThrownBy(() -> new FinalCat(-1, "name"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}