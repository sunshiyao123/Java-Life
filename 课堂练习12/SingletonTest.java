// //饿汉式
// package test;
// class Singleton {
//     private Singleton() {} 
//     //对构造方法进行封装
//     private static String name = "LiuMiao";
//     private static final Singleton singleton = new Singleton();
//     //产生一个新的对象
//     public static Singleton getSingleton() {
//         return singleton;
//     }
//     //定义一个方法返回对象
//     public void print() {
//         System.out.println("喜欢刘苗");
//     }
//     //定义一个普通方法
// }
// public class SingletonTest {
//     public static void main(String[] args) {
//         Singleton singleton = null; //声明对象
//         singleton = Singleton.getSingleton();  //获取对象
//         singleton.print();
//     }
// }

package test;
class Singleton {
    private Singleton() {} 
    //对构造方法进行封装
    private static String name = "LiuMiao";
    private static Singleton singleton;
    public static Singleton getSingleton() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        //表明此时还没有实例化
        return singleton;
    }
    //定义一个方法返回对象
    public void print() {
        System.out.println("喜欢刘苗");
    }
    //定义一个普通方法
}
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = null; //声明对象
        singleton = Singleton.getSingleton();  //获取对象
        singleton.print();
    }
}