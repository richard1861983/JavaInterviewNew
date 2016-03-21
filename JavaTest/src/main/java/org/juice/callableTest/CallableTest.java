package org.juice.callableTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by Administrator on 2016/3/21.
 */
public class CallableTest {
    public static void main(String[] args) {
        RtnThread rt = new RtnThread();

        FutureTask<Integer> task = new FutureTask<Integer>(rt);
        for(int i=0;i<100;i++) {
            System.out.println(Thread.currentThread().getName() + " 的循环变量i的值：" + i);
            if(i==20) {
                new Thread(task,"有返回值得线程").start();
            }
        }

        try {
            System.out.println("子线程的返回值:" + task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
