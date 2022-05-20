package greeng00se.effectivejava.chapter01.item05;

import java.util.List;

public class StaticUtilitySpellChecker {
    private static final Lexicon dictionary = new KoreanDictionary();

    private StaticUtilitySpellChecker() {
    }

    public static boolean isValid(String word) {
        throw new UnsupportedOperationException();
    }

    public static List<String> suggestions(String typo) {
        throw new UnsupportedOperationException();
    }
}

