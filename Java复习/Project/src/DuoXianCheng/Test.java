package DuoXianCheng;
//如何保护没有关联关系的多个资源
//class Account {
//    private Integer balance;
//    private String password;
//    //余额锁
//    private final Object balanceLock = new Object();
//    //密码锁
//    private final Object psdLock = new Object();
//    //取款
//    void withdraw(Integer amt) {
//        synchronized(balanceLock) {
//            if (this.balance > amt) {
//                this.balance -= amt;
//            }
//        }
//    }
//    //查看余额
//    Integer getBalance() {
//        synchronized(balanceLock) {
//            return balance;
//        }
//    }
//    //更改密码
//    void updatePassword(String pw) {
//        synchronized(psdLock) {
//            this.password = pw;
//        }
//    }
//    //查看密码
//    String getPassward() {
//        synchronized(psdLock) {
//            return this.password;
//        }
//    }
//}

import java.util.concurrent.locks.Lock;

//保护有关联关系的多个资源
//银行转账：
// A->B 100
// B->C 100
//class Account {
//    int sal;
//    public void synchronized zhuanZhang(Account target) {
//        this.sal -= 100;
//        synchronized(target) {
//            target.sal += 100;
//
//        }
//    }
//}
//
//
//
//public class Test {
//
//}




//import com.sun.xml.internal.ws.api.ha.StickyFeature;
//import java.util.concurrent.*;
////FutureTask测试
//class CallableTask implements Callable<String> {
//    private int ticket = 20;
//    @Override
//    public String call() throws Exception {
//        while (ticket > 0) {
//            System.out.println(Thread.currentThread().getName()
//                    +"还剩"+ticket--+"张票");
//        }
//        return "票买完了--";
//    }
//}
//public class Test {
//    public static void main(String[] args) throws Exception {
        //FutureTask使用
//        FutureTask<String> futureTask = new FutureTask<>(new CallableTask());
//        for (int i =0; i < 5; i++) {
//            new Thread(futureTask).start();
//        }

//        线程池
//        ExecutorService service =
//                Executors.newCachedThreadPool();
//        Callable<String> callable =
//                new CallableTask();
//        Future<String> future = null;
//        for (int i = 0; i < 5; i++) {
//            String str = service.submit(callable).get();
//            System.out.println(str);
//        }
//    }
//}






//Lock中的ReentrantReadWriteLock实现读写锁
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MyCache<K,V> {
    //存放具体数据
    private HashMap<K,V> hashMap;
    private ReentrantReadWriteLock lock =
            new ReentrantReadWriteLock();
    //并发读锁
    private Lock readLock = lock.readLock();
    //互斥写锁
    private Lock writerLock = lock.writeLock();
    public V get(K k) {
        readLock.lock();
        return hashMap.get(k);
    }
    public void put(K k, V v) {
        writerLock.lock();
        hashMap.put(k, v);
    }
}

//class MyThread implements Runnable{
//    @Override
//    public void run() {
//
//    }
//}

