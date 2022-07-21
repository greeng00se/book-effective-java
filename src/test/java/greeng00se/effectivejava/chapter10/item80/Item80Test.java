package greeng00se.effectivejava.chapter10.item80;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.*;

public class Item80Test {

    @Test
    void _1() throws ExecutionException, InterruptedException {
        // 고정된 수의 쓰레드를 재사용 할 수 있는 쓰레드 풀 생성
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(16);
        // 단일 쓰레드를 사용하는 Executor 생성
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        // 이전에 생성된 쓰레드를 캐싱하는 쓰레드 풀 생성, 쓰레드에서 60초 동안 작업이 없다면 쓰레드 제거
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        ExecutorService exec = Executors.newSingleThreadExecutor();

        // execute() 메서드를 이용하여 runnable 작업을 실행할 수 있다.
        Runnable runnable = () -> System.out.println("Hello World");
        exec.execute(runnable);

        // submit()은 반환 값이 없는 runnable, 반환 값이 있는 callable 전부 지원한다.
        Callable<Integer> callable = () -> 5;
        Integer integer = exec.submit(callable).get();

        // invokeAll()은 모든 작업이 끝나길 기다린다. 반환 값은 List<Future<T>> 타입이다.
        List<Future<Integer>> all = exec.invokeAll(List.of(callable, callable));
        for (Future<Integer> future : all) {
            System.out.println(future.get());
        }

        // invokeAny()는 작업 중 가장 먼저 끝나는 값을 반환한다.
        Integer any = exec.invokeAny(List.of(() -> 15, () -> 10));
        System.out.println(any);

        // 실행중인 작업들이 전부 수행되면 종료한다.
        exec.shutdown();
        // 즉시 종료하고, 실행되지 않은 작업들을 반환한다.
//        List<Runnable> runnableList = exec.shutdownNow();
    }
}
