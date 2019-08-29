package ThreadPractice;


/**
 * 生产消费者模型
 */
class Goods {
    private String goodsName;
    private int count;
    private int maxCount;

    public Goods(int maxCount) {
        this.maxCount = maxCount;
    }

    public synchronized void set(String goodsName) {
        while (count == maxCount) {
            System.out.println("此时还有商品，需要等待消费者消费了在继续生产");
            //让生产者阻塞
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //当运行到这一步说明需要继续生产
        this.goodsName = goodsName;
        count++;
        System.out.println(Thread.currentThread().getName()+"生产"+this);
        this.notifyAll();
    }

    public synchronized void get(){
        while (count == 0) {
            System.out.println("商品卖完了，需要等待卖家商家");
            //需要让消费者阻塞
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //这时候有货，继续消费
        count--;
        System.out.println(Thread.currentThread().getName()+"消费"+this);
        //唤醒生产者
        this.notifyAll();
    }
    @Override
    public String toString() {
        return "Goods{" +
                "goodsName='" + goodsName + '\'' +
                ", count=" + count +
                '}';
    }
}

class Producer implements Runnable {
    private Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true) {
            this.goods.set("一个小黑瓶");

        }
    }
}

class Consumer implements Runnable {
    private Goods goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true) {
            this.goods.get();
        }
    }
}
public class CPTest {
    public static void main(String[] args) throws InterruptedException {
        Goods goods = new Goods(3);
        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);

        Thread produceThread1 = new Thread(producer,"生产者1");
        Thread produceThread2 = new Thread(producer,"生产者2");
        Thread produceThread3 = new Thread(producer,"生产者3");

        Thread consumerThread1 = new Thread(consumer,"消费者1");
        Thread consumerThread2 = new Thread(consumer,"消费者2");
        Thread consumerThread3 = new Thread(consumer,"消费者3");
        Thread consumerThread4 = new Thread(consumer,"消费者4");

        consumerThread1.start();
        consumerThread2.start();
        consumerThread3.start();
        consumerThread4.start();
        produceThread1.start();
        produceThread2.start();
        produceThread3.start();

    }
}


