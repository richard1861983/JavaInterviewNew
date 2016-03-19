package org.juice.drawAccount003;

/**
 * Created by Administrator on 2016/3/19.
 */
public class TestDraw {
    public static void main (String[] args ) {
        Account acct = new Account("123456",1000);

        new DrawThread("甲",acct,800).start();
        new DrawThread("乙",acct,600).start();
    }
}
