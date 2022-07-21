package greeng00se.effectivejava.chapter10.item80;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

import static java.util.stream.Collectors.toList;

public class SumTask extends RecursiveTask<Long> {
    private static final int SEQUENTIAL_THRESHOLD = 5;

    private List<Long> data;

    public SumTask(List<Long> data) {
        this.data = data;
    }

    @Override
    protected Long compute() {
        if (data.size() <= SEQUENTIAL_THRESHOLD) {
            long sum = computeSum();
            return sum;
        } else {
            // 범위 계산
            int mid = data.size() / 2;
            SumTask firstTask = new SumTask(data.subList(0, mid));
            SumTask secondTask = new SumTask(data.subList(mid, data.size()));

            // fork()를 통해 작업을 분리한다.
            firstTask.fork();

            // join()을 이용하여 처리한 결과를 반환한다.
            return secondTask.compute() + firstTask.join();
        }
    }

    private long computeSum() {
        long sum = 0;
        for (Long l: data) {
            sum += l;
        }
        return sum;
    }

    public static void main(String[] args) {
        Random random = new Random();

        List<Long> data = random
                .longs(10, 1, 5)
                .boxed()
                .collect(toList());

        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(data);
        System.out.println("Sum: " + pool.invoke(task));
    }
}
