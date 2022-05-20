package greeng00se.effectivejava.chapter01.item05;

import java.util.List;

public class SingletonSpellChecker {

    private final Lexicon dictionary = new KoreanDictionary();

    private SingletonSpellChecker() {
    }

    public static final SingletonSpellChecker INSTANCE = new SingletonSpellChecker();

    public static boolean isValid(String word) {
        throw new UnsupportedOperationException();
    }

    public static List<String> suggestions(String typo) {
        throw new UnsupportedOperationException();
    }
}
