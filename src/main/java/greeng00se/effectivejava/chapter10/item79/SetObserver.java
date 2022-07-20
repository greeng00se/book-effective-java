package greeng00se.effectivejava.chapter10.item79;

@FunctionalInterface public interface SetObserver<E> {
    void added(ObservableSet<E> set, E element);
}
