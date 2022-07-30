package greeng00se.effectivejava.chapter11.item89;

import java.io.Serializable;
import java.util.Arrays;

public class Elvis implements Serializable {

    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {}

    private String[] favorites = { "Grape", "Nature" };

    public void printFavorites() {
        System.out.println(Arrays.toString(favorites));
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
