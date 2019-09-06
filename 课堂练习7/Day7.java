// //内部类

// class Person {
//     private String name = "刘苗";
//     //定义一个内部类
//     class Student {
//         //内部类中用一个普通方法输出外部类私有属性
//         public void print() {
//             System.out.println(name);
//         }
//     }
//     //外部类中用一个普通方法调用内部类
//     public void fun() {
//         Student stu = new Student();
//         stu.print();
//     }
// }
// public class Day7 {
//     public static void main(String[] args) {
//         //主类中调用外部类
//         Person per = new Person();
//         per.fun();
//     }
// }

// //将内部类代码改到外面
// class Person {
//     private String name = "刘苗";
//     public String getName() {
//         return this.name;
//     }
//     public void fun() {
//         Student stu = new Student(this);  //3.this表示当前对象
//         stu.print();  //5.调用方法
//     }
// }
// class Student {
//     private Person per;
//     public Student (Person per) {   
//         this.per = per;    //4.引用传递
//     }
//     public void print() {  //6.调用方法
//         System.out.println(per.getName()); 
//     }
// }
// public class Day7 {
//     public static void main(String[] args) {
//         Person per = new Person();   //1.实例化对象
//         per.fun();  //2.调用fun方法
//     }
// }

//内部类实现继承
// class A {
//     private String name = "刘苗";
//     public String getName() {
//         return this.name;
//     }
// }
// class B {
//     private int age =   20;
//     public int getAge() {
//         return this.age;
//     }
// }
// class Outter {
//     private class OutA extends A {
//         public String name() {
//             return super.getName(); 
//         }
//     }
//     private class OutB extends B {
//         public int age() {
//             return super.getAge();
//         }
//     }
//     public String name() {
//         return new OutA().name();
//     }
//     public int age() {
//         return new OutB().age();
//     }
// }
// public class Day7 {
//     public static void main(String[] args) {
//         Outter outter = new Outter();
//         System.out.println(outter.name());         
//         System.out.println(outter.age());         
//     }
// }

//内部类直接访问外部类元素
class Person {
    private String name;
    private int age;
    class Student {
        public Student() {
            Person.this.name = "诗尧";
            Person.this.age = 20;
        }
    }
}