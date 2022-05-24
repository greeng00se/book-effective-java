package greeng00se.effectivejava.chapter02.item10;

public class Example {

    private static class InnerClass {

        @Override
        public boolean equals(Object obj) {
            throw new AssertionError();
        }
    }
}
