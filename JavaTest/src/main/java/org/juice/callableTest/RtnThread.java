package org.juice.callableTest;

import java.util.concurrent.Callable;

/**
 * Created by Administrator on 2016/3/21.
 */
public class RtnThread implements Callable<Integer>{
    public Integer call() {
        int i = 0;
        for(;i<100;i++) {
            System.out.println(Thread.currentThread().getName() + " 的循环变量i的值:"+i);
        }

        return  i;
    }
}
