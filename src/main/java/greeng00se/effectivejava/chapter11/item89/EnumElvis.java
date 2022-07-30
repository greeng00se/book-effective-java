package greeng00se.effectivejava.chapter11.item89;

import java.util.Arrays;

public enum EnumElvis {
    INSTANCE;
    private String[] favorites = { "Grape", "Nature" };
    public void printFavorites() {
        System.out.println(Arrays.toString(favorites));
    }
}
