package org.juice.thread;

/**
 * Created by Administrator on 2016/3/19.
 */
public class ThreadTest extends Thread{
    private int i;

    public void run () {
        for (;i<100;i++) {
            System.out.println(getName() + " " +i);
        }
    }

    public static void main(String[] args) {
        for ( int i=0;i<100;i++) {
            System.out.println( Thread.currentThread().getName() + " " + i);

            if( i==20 ) {
                new ThreadTest().start();
                new ThreadTest().start();
            }
        }
    }
}
