// 1.创建一个Test类，包含有一个public权限的int型成员变量与一个char类型的成员变量，观察在main方法中的初始值。 
// class Test {
//     public int a;
//     public char b;
// }
// public class Ssy{
//     public static void main (String[] args){
//         Test test = new Test();
//         System.out.println(test.b);
//         System.out.println(test.a);
//     }
// }


// 2.编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类的某个特定的static成员变量只有一个属性。 
// class Person {
//     public static String country = "中国";
// }
// public class Ssy {
//     public static void main(String[] args) {
//         Person per1 = new Person();
//         Person per2 = new Person();
//         Person per3 = new Person();
//         Person per4 = new Person();
//         Person per5 = new Person();
//         System.out.println(per1.country);
//         System.out.println(per2.country);
//         System.out.println(per3.country);
//         System.out.println(per4.country);
//         System.out.println(per5.country);
//     }
// }




// 3.一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字(从第三个数字起)都是前两个数字的和。
//创建一个方法，接受一个整数参数，并显示从第一个元素开始总共由该参数指定的个数所构成的所有斐波那契数字。
//例如，如果运行 java Fibonacci 5(Fibonacci为类名)，那么输出应该是1、1、2、3、5。 
// class Fibonacci {
//     Fibonacci(int a){
//         for(int i = 1; i <= a; i++){
//             System.out.print(fibonacci(i)+",");
//         }
//     }
//     public int fibonacci(int b) {
//         if(b == 1||b == 2) {
//             return 1;
//         }
//         else {
//             return fibonacci(b-2)+fibonacci(b-1);
//         }
//     }
//  }
// public class Ssy {
//     public static void main(String[] args) {
//         new Fibonacci(5);
//     }
// }





// 4.创建一个带默认构造方法（即无参构造）的类，在构造方法中打印一条消息"Hello Constructor";
//再为这个类添加一个重载构造方法，令其接收一个字符串参数，并在这个有参构造方法中把"Hello Constructor"和接收的参数一起打印出来。 
// class Print {
//     Print() {
//         System.out.println("Helle Constructor");
//     }
//     Print(String a) {
//         System.out.println("Helle Constructor"+a);
//     }
// }
// public class Ssy {
//     public static void main(String[] args) {
//         new Print();
//         new Print(" Bite");
//     }
// }



// 5.定义一个Father和Child类，并进行测试。 
// 要求如下： 
// 1）Father类为外部类，类中定义一个私有的String类型的属性name，name的值为“zhangjun”。 
// 2）Child类为Father类的内部类，其中定义一个introFather()方法，方法中调用Father类的name属性。 
// 3）定义一个测试类Test，在Test类的main()方法中，创建Child对象，并调用introFather ()方法。 
// class Father {
//     private String name = "刘苗";
//     //成员内部类
//     class Child {
//         public void introFather() {
//             System.out.println(name);
//         }
//     }
// }
// public class Ssy {
//     public static void main(String[] args) {
//         Father.Child child = new Father().new Child();
//         child.introFather();
//     }
// }



// 6.简述下列程序运行结果: 
// class A{ 
//     int y=6; 
//     class Inner{ 
//         static int y=3;    //成员内部类不可以拥有静态属性
//         void show(){ 
//             System.out.println(y); 
//         } 
//     } 
// } 
// class Ssy{ 
//     public static void main(String [] args){ 
//         A.Inner inner=new A().new Inner(); 
//         inner.show(); 
//     } 
// }
//静态声明非法  




// 7.写出下面程序运行结果: 
// class A{ 
//     public A(){ 
//         System.out.println("A"); 
//     } 
// } 

// class Ssy extends A{ 
//     public B(){ 
//         System.out.println("B"); 
//     } 
//     public static void main(String[] args){ 
//         Ssy b=new Ssy(); 
//     } 
//  }
// //  A B 






// 8.编程题： 
// 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。 
// public class Ssy {
//     public static void main(String[] args) {
//         for(int i = 100; i <1000; i++) {
//             judge(i);
//         }
//     }
//     public static int judge(int a) {
//         int b = a%10;
//         int c = a/10%10;
//         int d = a/100;
//         if(b*b*b + c*c*c + d*d*d == a){
//             System.out.println(a);
//         }
//         return 0;
//     }
// }




// 9.编程题： 
// 定义一个抽象的"Role"类，有姓名，年龄，性别等成员变量 
// 1）要求尽可能隐藏所有变量(能够私有就私有,能够保护就不要公有)， 
// 再通过GetXXX()和SetXXX()方法对各变量进行读写。具有一个抽象的play()方法， 
// 该方法不返回任何值，同时至少定义两个构造方法。Role类中要体现出this的几种用法。 
// 2）从Role类派生出一个"Employee"类，该类具有Role类的所有成员（构造方法除外）， 
// 并扩展salary成员变量，同时增加一个静态成员变量“职工编号（ID）”。 
// 同样要有至少两个构造方法，要体现出this和super的几种用法，还要求覆盖play()方法， 
// 并提供一个final sing()方法。 
// 3）"Manager"类继承"Employee"类，有一个final成员变量"vehicle" 
// 在main()方法中制造Manager和Employee对象,并测试这些对象的方法。 
class Role{

}