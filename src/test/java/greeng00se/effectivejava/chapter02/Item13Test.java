package greeng00se.effectivejava.chapter02;

import greeng00se.effectivejava.chapter02.item13.Point;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Item13Test {

    @Test
    void cloneTest() {
        Point point = new Point(1, 2);
        Point clone = point.clone();

        assertThat(point != clone).isTrue();
        assertThat(point.getClass()).isEqualTo(clone.getClass());
        assertThat(point.equals(clone)).isTrue();
    }

}
