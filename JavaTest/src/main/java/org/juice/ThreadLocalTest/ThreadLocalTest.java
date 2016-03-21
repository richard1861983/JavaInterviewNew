package org.juice.ThreadLocalTest;

/**
 * Created by Administrator on 2016/3/21.
 */
public class ThreadLocalTest {
    public static void main(String[] args ) {
        Account at = new Account("初始名");

        new MyTest(at,"线程甲").start();
        new MyTest(at,"线程乙").start();
    }
}
