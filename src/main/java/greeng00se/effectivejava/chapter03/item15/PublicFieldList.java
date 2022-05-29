package greeng00se.effectivejava.chapter03.item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PublicFieldList {

    private static final String[] PRIVATE_VALUES = { "A", "B", "C" };

    // Java 8 이하 Immutable 리스트를 만들어 제공
    public static final List<String> VALUES_LESS_THAN_JAVA8 =
            Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    // Java 9 이상 Immutable 리스트를 만들어 제공
    public static final List<String> VALUES = List.of(PRIVATE_VALUES);

    // 방어적 복사를 통한 제공
    public static final String[] values() {
        return PRIVATE_VALUES.clone();
    }
}