package greeng00se.effectivejava.chapter02.item13;

public class Stack implements Cloneable {
    private Object[] elements;
    private int size = 0;

    @Override
    public Stack clone() {
        try {
            Stack result = (Stack) super.clone();
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
