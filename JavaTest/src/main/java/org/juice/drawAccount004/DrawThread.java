package org.juice.drawAccount004;

/**
 * Created by Administrator on 2016/3/19.
 */
public class DrawThread extends Thread {
    private Account account;
    private double drawAmount;

    public DrawThread(String name, Account account, double drawAmount ) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    public void run() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        account.draw(drawAmount);
    }
}
