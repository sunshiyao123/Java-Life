//继承：
// //父类
// class Person{
//     private String name;
//     public void setName(String name){
//         this.name = name;
//     }
//     public String getName(){
//         return name;
//     }
// }
// //这里使用了多层继承
// class Student extends Person{
// }
// class Me extends Student{
// }
// public class Day6{
//     public static void main(String[] args){
//         Me i = new Me();
//         i.setName("诗尧");
//         System.out.println(i.getName());
//     }
// }


//覆写：
// class Person {
//     public void print() {
//         System.out.println("1.父类的print方法");
//     }
// }
// class Student extends Person {
//     //方法覆写
//     public void print() {
//         System.out.println("1.子类的print方法");
//     }
// }
// public class Day6{
//     public static void main(String[] args){
//         Student stu = new Student();
//         stu.print();
//     }
// }

// class Person {
//     public void fun(){
//         this.print();
//     }
//     //private权限，表示该方法只能被父类使用，子类无法使用，子类根本就不知道父类有这样的方法
//     private void print() {
//         System.out.println("1.父类的print方法");
//     }
// }
// class Student extends Person {
//     //这个时候只是子类定义的新方法，并没有和父类有任何关系
//     public void print() {
//         System.out.println("1.子类的print方法");
//     }
// }
// public class Day6{
//     public static void main(String[] args){
//         Student stu = new Student();
//         stu.fun();
//     }
// }
 
// super关键字
// class Person {
//     public void print(){
//         System.out.println("1.父类的print方法");
//     }
// }
// class Student extends Person {
//     public void print(){
//         //super关键字调用父类同名方法
//         super.print();
//         System.out.println("2.子类的print方法");
//     }
// }
// public class Day6{
//     public static void main(String[] args){
//         Student stu = new Student();
//         stu.print();
//     }
// }

// class Person {
//     public String info = "刘苗";
// }
// class Student extends Person {
//     public String info = "诗尧";
//     public void print(){
//         //super关键字调用父类同名属性
//         System.out.println(info);
//         System.out.println(super.info);
//     }
// }
// public class Day6{
//     public static void main(String[] args){
//         Student stu = new Student();
//         stu.print();
//     }
// }

//final关键字
// class Person { 
//     final String name;
//     public void setName(String name){
//         this.name = name;
//     }
//     public String getName(){
//         return name;
//     }
//     // public void print(){
//     //     System.out.println("诗尧");
//     // }
// }
// class Student extends Person {
//     // public  void print(){
//     //     System.out.println("刘苗");
//     // }
// }
// public class Day6{
//     public static void main(String[] args){
//     Student stu = new Student();
//     stu.setName("刘苗");
//     System.out.println(stu.getName());
//     }
// }

// class Person { 
//     final String name;
// }
// class Student extends Person {
// }
// public class Day6{
//     public static void main(String[] args){
//         new Student();
//     }
// }

// class Person { 
//     //对常量赋值
//     public static final int SSY_AGE = 20;
// }
// class Student extends Person {
// }
// public class Day6{
//     public static void main(String[] args){
//     Student stu = new Student();
//     stu.SSY_AGE = 21;
//     System.out.println(stu.SSY_AGE);
//     }
// }


//多态性
// class Person {
//     public void print() {
//         System.out.println("1.父类的print方法");
//     }
// }
// class Student extends Person {
//     public void print() {
//         System.out.println("2.子类的print方法");
//     }
// }
// public class Day6 {
//     public static void main(String[] args) {
//         //这里向上转型
//         //Person per = new Student();
//         //这里再进行向下转型
//         //Student stu = (Student)per;

//         //这里没有进行向上转型
//         Person per = new Person();
//         Student stu = (Student)per;
//         stu.print();
//     }
// }