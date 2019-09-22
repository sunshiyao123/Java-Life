//public class ThreadTest {
//    public static void main(String[] args) {
//
////        MyThread myThread1 = new MyThread("诗尧");
////        MyThread myThread2 = new MyThread("喜欢");
////        MyThread myThread3 = new MyThread("刘苗");
////        myThread1.start();
////        myThread2.start();
////        myThread3.start();
//
//        //匿名内部类
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("喜欢刘苗");
//            }
//        }).start();
//
//    }
//}
//
//class MyThread implements Runnable {
//    private String title;
//    public MyThread(String title) {
//        this.title = title;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(this.title+"i="+i);
//        }
//    }
//}