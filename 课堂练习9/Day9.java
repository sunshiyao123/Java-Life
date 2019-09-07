// //定义一个抽象类
// abstract class Person {
//     //属性
//     private String name;
//     //普通方法
//     public String getName() {
//         return this.name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     //抽象方法
//     public abstract void getPersonInfo();
// }
// //子类继承父类并且覆写父类方法
// class Student extends Person {
//     public void getPersonInfo() {
//         System.out.println("我是学生");
//     }
// }

// public class Day9 {
//     public static void main(String[] args) {
//         Person per = new Student();//向上转型
//         per.getPersonInfo();
//     }
// }

// abstract class Person {
//     //属性
//     private String name;
//     //普通方法
//     public String getName() {
//         return this.name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     //抽象方法
//     public abstract void getPersonInfo();
//     //取得子类对象
//     public static Person getInstance() {
//         class Student extends Person{
//             public void getPersonInfo() {
//                 System.out.println("我是学生");
//             }
//         }
//         return new Student();
//     }
// }

// public class Day9 {
//     public static void main(String[] args) {
//         Person per = Person.getInstance();
//         per.getPersonInfo();
//     }
// }




// //抽象类也可拥有构造方法
// abstract class Person {
//     //构造方法
//     public Person() {
//         System.out.println("父类构造方法");
//     }
//     //抽象方法
//     public abstract void getPersonInfo();
// }

// class Student extends Person {
//     public Student() {
//         System.out.println("子类构造方法");
//     }
//     public void getPersonInfo() {
//         //空实现
//     }
// }

// public class Day9 {
//     public static void main(String[] args) {
//     new Student();
//     }
// }


//面试题
// abstract class A {
//     public A() {
//         this.print(); //4.调用被子类覆写的方法
//     }
//     public abstract void print();
// }
// class B extends A {
//     private int num = 100;
//     public B(int num) {  //2.调用子类实例化对象
//         super();  //3.隐含的一段语句，要先调用父类构造
//         this.num = num;  //6.为类中属性初始化
//     }
//     public void print() {
//         System.out.println(this.num);  //5.当前子类属性还未初始化，则输出其默认值
//     }
// }
// public class Day9 {
//     public static void main(String[] args) {
//         new B(30); //1.实例化子类对象
//     }
// }

//抽象类没有抽象方法也不能实例化
// abstract class A {}
// class B extends A {}
// public class Day9 {
//     public static void main(String[] args) {
//         A a =9 new A();
//     }
// }


//外部抽象类与内部抽象类
abstract class A { //外部抽象类
    public abstract void printA();
    abstract class B {  //内部抽象类
        public abstract void printB();
    }
}

class C extends A {
    public void printA() {
        System.out.println("喜欢刘苗");
    }
    class D extends B {
        public void printB() {
            System.out.println("喜欢诗尧");
        }
    }
}

public class Day9 {
    public static void main(String[] args) {
        A a = new C();
        A.B b = new C().new D();
        a.printA();
        b.printB();
    }
}