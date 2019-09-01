package DuoXianCheng;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Thread(new CountDownTask(countDownLatch),"运动员A").start();
        Thread.sleep(1000);
        new Thread(new CountDownTask(countDownLatch),"运动员B").start();
        Thread.sleep(1000);
        new Thread(new CountDownTask(countDownLatch),"运动员C").start();
        Thread.sleep(1000);
        //线程一直阻塞，直到CountDownLatch计数器的值减为0才会恢复执行
        countDownLatch.await();
        System.out.println("所有运动员已经到达终点，比赛结束！");
    }
}
class CountDownTask implements Runnable {
    private CountDownLatch countDownLatch;
    public CountDownTask(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"已到达终点");
        //减去计数器的值
        countDownLatch.countDown();
    }
}
