package org.juice.drawAccount004;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2016/3/19.
 */
public class Account {
    private final ReentrantLock lock = new ReentrantLock();
    private String accountNo;
    private double balance;

    public Account() {};

    public Account(String accountNo,double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void draw(double drawAmount) {
        lock.lock();
        try {
            if(balance>=drawAmount) {
                System.out.println("取款成功!"+drawAmount);

                balance -= drawAmount;
                System.out.println("\t余额为"+balance);
            } else {
                System.out.println("取款失败!");
            }
        } finally {
            lock.unlock();
        }
    }

    public int hashCode() {
        return accountNo.hashCode();
    }

    public boolean equals(Object obj ) {
        if(obj !=null && obj.getClass()==Account.class ) {
            Account target = (Account)obj;
            return target.getAccountNo().equals(accountNo) ;
        }
        return false;
    }
}
