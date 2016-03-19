package org.juice.drawAccount;

/**
 * Created by Administrator on 2016/3/19.
 */
public class DrawThread extends Thread {
    private Account account;
    private double drawAmount;

    public DrawThread(String name,Account account,double drawAmount ) {
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
        if( account.getBalance() >= drawAmount ) {
            System.out.println( getName()+"取款成功!"+drawAmount );

            account.setBalance(account.getBalance()-drawAmount);
            System.out.println("\t余额为:" + account.getBalance());
        } else {
            System.out.println(getName() + "取款失败!");
        }
    }
}
