package greeng00se.effectivejava.chapter07.item54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringGenerator {

    private static final String[] EMPTY_ARRAY = new String[0];
    private static final List<String> strings = List.of("EMPTY", "CHANGE", "ROOM");

    public List<String> getStringList() {
        return strings.isEmpty() ? Collections.emptyList() : new ArrayList<>(strings);
    }

    public String[] getStringArray() {
        return strings.toArray(EMPTY_ARRAY);
    }
}
