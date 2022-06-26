package greeng00se.effectivejava.chapter07.item48;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Item48Test {

    @Test
    @DisplayName("0과 음의 정수를 받는 경우 오류를 던진다.")
    void bigIntegerTest() {
        BigInteger bigInteger = new BigInteger("135");

        assertThatThrownBy(() -> bigInteger.mod(BigInteger.valueOf(-1L)))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("BigInteger: modulus not positive");

    }

    private static void sort(long a[], int offset, int length) {
        assert a != null;
        assert offset >= 0 && offset <= a.length;
        assert length >= 0 && length <= a.length - offset;
    }
}
