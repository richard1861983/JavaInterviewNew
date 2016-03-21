package org.juice.ThreadLocalTest;

/**
 * Created by Administrator on 2016/3/21.
 */
 class Account {
    private ThreadLocal<String> name = new ThreadLocal<String> ();

    public Account (String str) {
        this.name.set(str);
        System.out.println("-----" + this.name.get());
    }

    public String getName() {
        return name.get();
    }

    public void setName(String str) {
        this.name.set(str);
    }
}

class MyTest extends Thread {
    private Account account;
    public MyTest(Account account,String name) {
        super(name);
        this.account = account;
    }

    public void run() {
        for (int i=0;i<100;i++) {
            if(i==6) {
                account.setName(getName());
            }
            System.out.println(account.getName() + "账户的i值:" + i);
        }
    }
}