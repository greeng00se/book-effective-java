package greeng00se.effectivejava.chapter10.item81;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Item81Test {

    @Test
    @DisplayName("동시 실행 시간을 재는 프레임워크")
    void _1() throws InterruptedException {
        final int concurrency = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(concurrency);
        Runnable action = () -> System.out.println("ACTION");

        CountDownLatch ready = new CountDownLatch(concurrency);
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch done = new CountDownLatch(concurrency);
        ConcurrentHashMap
        for (int i = 0; i < concurrency; i++) {
            executorService.execute(() -> {
                ready.countDown();
                try {
                    start.await();
                    action.run();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    done.countDown();
                }
            });
        }

        ready.await();
        long startNanos = System.nanoTime();
        start.countDown();
        done.await();
        System.out.println(System.nanoTime() - startNanos);

        executorService.shutdown();
    }
}
