package greeng00se.effectivejava.chapter05.item36;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static greeng00se.effectivejava.chapter05.item36.TextStatic.*;
import static org.assertj.core.api.Assertions.assertThat;

class Item36Test {

    @Test
    @ParameterizedTest
    void bitFieldTest() {
        int style = STYLE_BOLD | STYLE_UNDERLINE;

        assertThat(style & STYLE_BOLD).isNotZero();
        assertThat(style & STYLE_ITALIC).isZero();
        assertThat(style & STYLE_UNDERLINE).isNotZero();
        assertThat(style & STYLE_STRIKETHROUGH).isZero();
    }

}