//public class MethodTest {
//    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        Thread thread1 = new Thread(myThread,"诗尧");
//        Thread thread2 = new Thread(myThread,"刘苗");
//        Thread thread3 = new Thread(myThread,"喜欢");
//        thread1.start();
//        thread3.start();
//        thread2.start();
//    }
//}
//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+"   i="+i);
//        }
//    }
//}


import javafx.scene.input.DataFormat;
import org.omg.PortableServer.THREAD_POLICY_ID;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

//class MyThread implements Runnable {
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 3; i++) {
//            Thread.yield();
//            System.out.println("当前线程为"+ Thread.currentThread().getName()
//                    +",i="+i);
//        }
//    }
//}
//public class MethodTest {
//    public static void main(String[] args) {
//        MyThread mt = new MyThread();
//        Thread thread1 = new Thread(mt,"诗尧");
//        Thread thread2 = new Thread(mt,"喜欢");
//        Thread thread3 = new Thread(mt,"刘苗");
//        thread1.start();
//        thread2.start();
//        thread3.start();
//    }
//}

//public class MethodTest {
//    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        Thread thread1 = new Thread(myThread, "诗尧");
//        thread1.start();
//        System.out.println(Thread.currentThread().getName());
//        thread1.join();
//    }
//    public static void printTime() {
//        Date date = new Date();
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String time = format.format(date);
//        System.out.println(time);
//    }
//}
//class MyThread implements Runnable {
//    @Override
//    public void run() {
//        try {
//            System.out.println("主线程睡眠前时间");
//            MethodTest.printTime();
//            Thread.sleep(2000);
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("睡眠结束的时间");
//            MethodTest.printTime();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}


//使用两种停止方法停止
//class MyThread implements Runnable {
//    private boolean flag = true;
//    @Override
//    public void run() {
//        int i = 1;
//        while (flag) {
//            try {
//                Thread.sleep(1000);
//                System.out.println("第"+i+"次执行,线程名称为："+
//                        Thread.currentThread().getName());
//                i++;
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public void setFlag(boolean flag) {
//        this.flag = flag;
//    }
//}
//public class MethodTest {
//    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        Thread thread1 = new Thread(myThread,"子线程");
//        thread1.start();
//        Thread.sleep(5000);
//        myThread.setFlag(false);
////        thread1.stop();
//    }
//}

class MyThread implements Runnable{
    
    @Override
    public void run() {

    }
}










//class Singleton {
//    //volatile锁是为了在new Singleton()上设置一堵墙，使得其他线程不会先return
//    private static volatile Singleton singleton;
//    private Singleton(){}
//    public static Singleton getInstance() {
//        //判断singleton为空才可以去new
//        if (singleton == null) {
//            //此锁为了使得只有一个线程能够去new
//            synchronized(Singleton.class) {
//                //使得只有一个对象可以
//                if (singleton == null) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }
//}


