package greeng00se.effectivejava.chapter03.item17;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

class Item17Test {

    @Test
    void negate() {
        BigInteger bigInteger = new BigInteger("1");
        BigInteger negate = bigInteger.negate();
        Assertions.assertThat(negate.intValue()).isEqualTo(-1);
    }

}