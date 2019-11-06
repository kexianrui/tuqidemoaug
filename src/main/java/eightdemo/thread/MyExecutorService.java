package eightdemo.thread;

import java.util.concurrent.*;

public class MyExecutorService {
    private static Integer POOL_SIZE = 20;
    private static void me() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(POOL_SIZE, POOL_SIZE,
                0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(10),
                new ThreadPoolExecutor.AbortPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.getActiveCount();
    }
}
