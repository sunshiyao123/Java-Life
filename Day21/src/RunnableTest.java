//public class RunnableTest {
//    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//         Thread thread1 = new Thread(myThread);
//         thread1.start();
//        Thread thread2 = new Thread(myThread);
//        thread2.start();
//    }
//}
//class MyThread implements Runnable {
//    private int ticket = 10;
//    @Override
//    public void run() {
//        while (ticket > 0) {
//            System.out.println("剩余票数为"+this.ticket--);
//        }
//    }
//}
