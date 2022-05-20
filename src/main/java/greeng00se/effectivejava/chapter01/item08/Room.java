package greeng00se.effectivejava.chapter01.item08;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable {
    private static final Cleaner CLEANER = Cleaner.create();

    // 방의 상태. cleanable과 공유한다.
    private final State state;

    // cleanalbe 객체, 수거 대상이 되면 방을 청소한다.
    private final Cleaner.Cleanable cleanable;

    public Room() {
        this.state = new State();
        this.cleanable = CLEANER.register(this, state);
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }

    // Room을 참조해서는 안된다.
    private static class State implements Runnable {
        @Override
        public void run() {
            System.out.println("청소");
        }
    }
}
