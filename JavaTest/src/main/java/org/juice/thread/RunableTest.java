package org.juice.thread;

/**
 * Created by Administrator on 2016/3/19.
 */
public class RunableTest implements Runnable {
    private int i;

    public void run() {
        for (i=0;i<300;i++) {
            System.out.println(Thread.currentThread().getName() + " " + i );
        }
    }

    public static void main( String[] args ) {
        for( int i=0 ; i<1000;i++ ) {
            System.out.println(Thread.currentThread().getName() + " " + i );

            if( i==20 ) {
                RunableTest st =  new RunableTest();

                new Thread( st,"新线程1").start();
                new Thread( st,"新线程2").start();
            }
        }
    }
}
