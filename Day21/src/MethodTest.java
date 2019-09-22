public class MethodTest {
    public static void main(String[] args) {
//        MyThread mythread = new MyThread();
//        new Thread(mythread).start();
//        new Thread(mythread,"诗尧").start();
//        new Thread(mythread,"刘苗").start();

        MyThread myThread = new MyThread();
        myThread.run();
        new Thread(myThread).start();
    }
}
class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("当前线程"+Thread.currentThread().getName()+"i="+i);
        }
    }
}
