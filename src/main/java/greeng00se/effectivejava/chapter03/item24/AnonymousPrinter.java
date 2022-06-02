package greeng00se.effectivejava.chapter03.item24;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AnonymousPrinter {
    private final int x;
    private final int y;

    public Thread printer = new Thread() {
        final int a = 5;

        public void run() {
            System.out.println(a + x + y);
        }
    };
}