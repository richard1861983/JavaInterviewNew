package org.juice.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2016/3/21.
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(6);
        pool.submit(new TestThread());
        pool.submit(new TestThread());
        pool.shutdown();
    }
}
