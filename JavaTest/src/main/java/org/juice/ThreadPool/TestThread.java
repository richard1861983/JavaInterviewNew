package org.juice.ThreadPool;

/**
 * Created by Administrator on 2016/3/21.
 */
public class TestThread implements Runnable {
    public void run() {
        for (int i=0;i<100;i++) {
            System.out.println(Thread.currentThread().getName() + "的i的值为：" +i);
        }
    }
}
