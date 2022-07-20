package greeng00se.effectivejava.chapter10.item79;

import greeng00se.effectivejava.chapter03.item18.ForwardingSet;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class ObservableSet<E> extends ForwardingSet<E> {
    public ObservableSet(Set<E> set) {
        super(set);
    }

    // 관찰자 리스트
    private final List<SetObserver<E>> observers = new CopyOnWriteArrayList<>();

    // 관찰자 추가
    public void addObserver(SetObserver<E> observer) {
        observers.add(observer);
    }

    // 관찰자 제거
    public boolean removeObserver(SetObserver<E> observer) {
        return observers.remove(observer);
    }

    // Set add -> 관찰자의 added 메서드를 호출하여 동기화 도중 제어권을 넘기는 중
    private void notifyElementAdded(E element) {
        for (SetObserver<E> observer : observers)
            observer.added(this, element);
    }

    @Override
    public boolean add(E element) {
        boolean added = super.add(element);
        if (added)
            notifyElementAdded(element);
        return added;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean result = false;
        for (E element : c)
            result |= add(element);
        return result;
    }
}
