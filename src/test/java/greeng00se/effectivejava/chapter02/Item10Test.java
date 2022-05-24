package greeng00se.effectivejava.chapter02;

import greeng00se.effectivejava.chapter02.item10.CaseInsensitiveString;
import greeng00se.effectivejava.chapter02.item10.ColorPoint;
import greeng00se.effectivejava.chapter02.item10.Point;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

public class Item10Test {

    @Test
    void stringEqualsTest() {
        String abc1 = "abc";
        String abc2 = "abc";

        assertThat(abc1 == abc2).isTrue();
    }

    @Test
    void samePatternTest() {
        Pattern p1 = Pattern.compile("[0-9]");
        Pattern p2 = Pattern.compile("[0-9]");
        assertThat(p1.pattern().equals(p2.pattern())).isTrue();
    }

    @Test
    void checkReflexivity() {
        String son = "son";
        assertThat(son.equals(son)).isTrue();
    }

    @Test
    void violationSymmetry() {
        CaseInsensitiveString cis = new CaseInsensitiveString("Korean");
        String s = "Korean";

        assertThat(cis.equals(s)).isTrue();
        assertThat(s.equals(cis)).isFalse();
    }

    @Test
    void transitivity() {
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLACK);

        assertThat(p1.equals(p2)).isTrue();
        assertThat(p2.equals(p3)).isTrue();
        assertThat(p3.equals(p1)).isFalse();
    }
}
