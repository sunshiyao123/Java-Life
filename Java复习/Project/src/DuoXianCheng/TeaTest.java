package DuoXianCheng;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TeaTest {
    public static void main(String[] args) throws
            ExecutionException, InterruptedException {
        FutureTask<String> futureTask2 =
                new FutureTask<>(new Task2());
        FutureTask<String> futureTask1 =
                new FutureTask<>(new Task1(futureTask2));
        new Thread(futureTask1).start();
        new Thread(futureTask2).start();
        //让主线程等待调用1.get
        System.out.println(futureTask1.get());
        System.out.println("主线程结束");
    }
}
//线程1的任务
class Task1 implements Callable<String> {
    private FutureTask<String> futureTask;
    public Task1(FutureTask futureTask) {
        this.futureTask = futureTask;
    }

    @Override
    public String call() throws Exception {
        System.out.println("1.洗水壶");
        Thread.sleep(1000);
        System.out.println("1.烧开水");
        Thread.sleep(5000);
        System.out.println("等待茶叶");
        //线程1阻塞到此处一直到线程2返回为止
        String str = futureTask.get();
        System.out.println("拿到茶叶");
        System.out.println("泡茶");
        return "上茶";
    }
}
//线程2的任务
class Task2 implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("2.洗茶壶");
        Thread.sleep(1000);
        System.out.println("2.洗茶杯");
        Thread.sleep(1000);
        System.out.println("2.上茶叶");
        return "西湖龙井";
    }
}
