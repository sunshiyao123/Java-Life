// interface IMessage {
//     //全局变量
//     public static final String MSG = "我喜欢刘苗";
//     //抽象方法
//     public abstract void print();
// }

// interface INews {
//     public abstract String getNews();
// }
// //一个子类继承多个接口实现多继承，必须覆写接口中所有抽象方法
// class MessageImpl implements IMessage,INews {
//     public void print() {
//         System.out.println("诗尧");
//     }
//     public String getNews() {
//         return IMessage.MSG; //访问常量加上类名称
//     }
// }

// public class Day8 {
//     public static void main(String[] args) {
//         IMessage m = new MessageImpl(); //子类向上转型得到接口的实例化对象
//         m.print(); //调用被子类覆写的方法
//         INews n = (INews) m; //对象进行类型转换
//         System.out.println(n.getNews());
//     }
// }

//子类覆写方法不可以有比接口中更为严格的权限
// interface IMessage {
//     void print(); //自动在前面加上public static final abstract
// }
// class MessageImpl implements IMessage {
//     void print() {
//         System.out.println("诗尧");
//     }
// }


//子类继承抽象类和实现接口
// interface IMessage { //接口
//     void print();
// }
// abstract class News { //抽象类
//     public abstract void getNews();
//      //必须在方法前加上public abstract，否则会被认为是普通方法
// }
// //先继承接口在继承抽象类
// class MessageImpl extends News implements IMessage { 
//     public void print() {
//         System.out.println("诗尧");
//     }
//     public void getNews() {
//         System.out.println("刘苗");
//     }
// }
// public class Day8 {
//     public static void main(String[] args) {
//         News N = new MessageImpl();
//         N.getNews();
//         IMessage M = (IMessage) N; //类型转换
//         M.print();
//         }
// }


//抽象类实现接口
// interface IMessage { //接口
//     void print();
// }
// abstract class News implements IMessage { //抽象类
//     public abstract void getNews();
//      //必须在方法前加上public abstract，否则会被认为是普通方法
// }
// //继承抽象类
class MessageImpl extends News { 
    public void print() {
        System.out.println("诗尧");
    }
    public void getNews() {
        System.out.println("刘苗");
    }
}
public class Day8 {
    public static void main(String[] args) {
        News N = new MessageImpl();
        N.getNews();
        IMessage M = (IMessage) N; //类型转换
        M.print();
        }
}

//接口之间的多继承
// interface A {
//     void printA();
// }
// interface B {
//     void printB();
// }
// //使用extends继承接口A,B
// interface C extends A,B {
//     void printC();
// }
// class D implements C {
//     public void printA(){};
//     public void printB(){};
//     public void printC(){};
// }