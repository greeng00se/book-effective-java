package greeng00se.effectivejava.chapter04.item28;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayChooser<T> {

    private final Object[] choiceArray;

    public ArrayChooser(Collection<T> choices) {
        this.choiceArray = (T[]) choices.toArray();
    }

    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return (T) choiceArray[rnd.nextInt(choiceArray.length)];
    }
}
