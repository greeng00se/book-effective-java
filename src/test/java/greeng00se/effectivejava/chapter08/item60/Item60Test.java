package greeng00se.effectivejava.chapter08.item60;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class Item60Test {

    @Test
    @DisplayName("0.1, 0.2, 0.3, 0.4 가격으로 총 물건을 4개 구입하리라 예상했지만 부동소수점 연산의 오차에 의해 3개만 구입된다.")
    void _1() {
        double funds = 1.00;
        int itemsBought = 0;
        for (double price = 0.10; funds >= price; price += 0.10) {
            funds -= price;
            itemsBought++;
        }
        assertThat(itemsBought).isNotEqualTo(4);
        assertThat(funds).isNotEqualTo(0);
    }

    @Test
    @DisplayName("BigDecimal 이용하면 예상했던 결과와 동일하게 물건이 4개 구입된다.")
    void _2() {
        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS;
             funds.compareTo(price) >= 0;
             price = price.add(TEN_CENTS)) {
            funds = funds.subtract(price);
            itemsBought++;
        }

        assertThat(itemsBought).isEqualTo(4);
        assertThat(funds).isEqualTo(new BigDecimal("0.00"));
    }

    @Test
    @DisplayName("달러 대신 센트를(int) 사용해서 성능 저하 없이 연산을 수행할 수도 있다.")
    void _3() {
        int itemsBought = 0;
        int funds = 100;
        for (int price = 10; funds >= price; price += 10) {
            funds -= price;
            itemsBought++;
        }
        assertThat(itemsBought).isEqualTo(4);
        assertThat(funds).isEqualTo(0);
    }
}
