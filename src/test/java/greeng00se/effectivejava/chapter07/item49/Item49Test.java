package greeng00se.effectivejava.chapter07.item49;

import greeng00se.effectivejava.chapter06.item49.Period;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class Item49Test {

    @Test
    void test() {
        Date start = new Date();
        Date end = new Date();

        Period period = new Period(start, end);
        end.setYear(78); // but deprecated
    }
}
