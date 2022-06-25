package greeng00se.effectivejava.chapter06.item47;

import java.util.*;

// 한 집합의 모든 부분집합을 원소로 하는 집합을 반환하는 예시
public class PowerSet {
    public static final <E> Collection<Set<E>> of(Set<E> s) {
        List<E> src = new ArrayList<>(s);
        if (src.size() > 30)
            throw new IllegalArgumentException("집합의 원소가 너무 많아요" + s);

        return new AbstractList<Set<E>>() {
            @Override
            public int size() {
                return 1 << src.size();
            }

            @Override
            public boolean contains(Object o) {
                return o instanceof Set && src.containsAll((Set)o);
            }

            @Override
            public Set<E> get(int index) {
                Set<E> result = new HashSet<>();
                for (int i = 0; index != 0; i++, index >>= 1)
                    if ((index & 1) == 1)
                        result.add(src.get(i));
                return result;
            }
        };
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList("1", "2", "3"));
        Collection<Set<String>> of = of(set);
        System.out.println(of.size());
        for (Set<String> strings : of) {
            for (String string : strings) {
                System.out.println(strings + ": " + string);
            }
        }
    }
}
