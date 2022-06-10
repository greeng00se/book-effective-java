package greeng00se.effectivejava.chapter04.item30;

import java.util.HashSet;
import java.util.Set;

public class Union {

//    public static Set union(Set s1, Set s2) {
//        Set result = new HashSet(s1);
//        result.addAll(s2);
//        return result;
//    }

    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> s1 = Set.of("톰", "제리", "물");
        Set<String> s2 = Set.of("커피", "음료", "국수");
        Set<String> union = union(s1, s2);
        System.out.println(union);
    }
}
