package greeng00se.effectivejava.chapter03.item15;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class Item15Test {

    @Test
    @DisplayName("final List 에서는 값을 추가할 수 없다.")
    void test() {
        List<String> list = PublicFieldList.VALUES;
        Assertions.assertThatThrownBy(() -> list.add("water"))
                .isInstanceOf(UnsupportedOperationException.class);
    }

}