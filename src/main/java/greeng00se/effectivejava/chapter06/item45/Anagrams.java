package greeng00se.effectivejava.chapter06.item45;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.groupingBy;

public class Anagrams {

    public static void anagram(List<String> dictionary, int minGroupSize) {
        dictionary.stream()
                .collect(groupingBy(word -> alphabetize(word)))
                .values().stream()
                .filter(group -> group.size() >= minGroupSize)
                .forEach(g -> System.out.println(g.size() + ": " + g));
    }

    private static String alphabetize(String s) {
        char[] a = s.toLowerCase().toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

    public void anagram2(List<String> dictionary, int minGroupSize) {
        dictionary.stream()
                .collect(
                        groupingBy(word -> word.chars().sorted()
                                .collect(StringBuilder::new,
                                        (sb, c) -> sb.append((char) c),
                                        StringBuilder::append)
                                .toString()))
                .values().stream()
                .filter(group -> group.size() >= minGroupSize)
                .map(group -> group.size() + ": " + group)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> dictionary = Arrays.asList("State", "Taste", "Print");
        int minGroupSize = 1;

        anagram(dictionary, minGroupSize);
    }
}
