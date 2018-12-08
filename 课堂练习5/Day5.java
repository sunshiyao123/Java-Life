//this 调用本类属性：
// class Person{
//     private String Name;
//     private int Age;
//     public Person(String Name, int Age){
//         this.Name = Name;   //使用this关键字当参数名称与属性名称相同时可以使用
//         this.Age = Age;
//     }
//     public String getPersonInfo(){
//         return "姓名："+ Name +",年龄：" + Age;
//     }
// }

// public class Day5{
//     public static void main (String[] args){
//         Person per = new Person("刘苗",20);
//         System.out.println(per.getPersonInfo());
//     }
// }

//this调用本类方法
// class Person{
//     private String Name;
//     private int Age;
//     public Person(String Name, int Age){
//         this.Name = Name;
//         this.Age = Age;
//         this.print(); //这里使用this关键字调用普通方法
//     }
//     public String getPersonInfo(){
//         return "姓名："+ Name +",年龄：" + Age;
//     }
//     public void print(){
//         System.out.println("*****************");
//     }
// }
// public class Day5{
//     public static void main (String[] args){
//         Person per = new Person("刘苗",20);
//         System.out.println(per.getPersonInfo());
//     }
// }

//this调用构造方法
// class Person{
//     private String name;
//     private int age;
//     public Person(){
//         this("诗尧",20);
//         System.out.println("*******一个新的Person对象*******");
//     }
//     public Person(String name){
//         this();          //使用this关键字进行内部互相调用
//         this.name = name;
//     }
//     public Person(String name,int age){
//         this(name);      //调用的是带有参数的Person（name）
//         this.age = age;
//     }
//     public String getPersonInfo(){
//         return "姓名："+ name +",年龄："+age;
//     }
// }

// public class Day5{
//     public static void main(String[] args){
//         Person per = new Person("刘苗",20);
//         System.out.println(per.getPersonInfo());
//     }
// }


//this表示当前对象
// class Person{
//     public void print(){
//         System.out.println("[PRINT]方法："+this);
//     }
// }

// public class Day5{
//     public static void main(String[] args){
//         Person per1 = new Person();
//         System.out.println("[MAIN]方法: "+ per1);
//         per1.print();
//         System.out.println("*****************************");
//         Person per2 = new Person();
//         System.out.println("[MAIN]方法"+ per2);
//         per2.print();
//     }
// } 

//static
// class Person{
//     //普通属性-对象属性
//     private String name;
//     private int age;
//     //类属性-共享属性
//     public static String country;
//     public Person(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
//     public void fun(){
//         System.out.println(name +"今年"+ age +"岁在"+country);
//     }
// }
// public class Day5{
//     public static void main(String[] args){
//         Person per1 = new Person("诗尧",20);  
//         Person.country = "中国";  //类属性赋值直接用类名称
//         per1.fun();
//     }
// }

// class Person{
//     public static String country;
// }
// public class Day5{
//     public static void main(String[] args){
//         System.out.println(Person.country);
//     }
// }

// class Person{
//     private String name;
//     private int age;
//     public void fun(){
//     static int i = 0;
//     }
// }
// public class Day5{
//     public static void main(String[] args){
//         Person per1 = new Person();
//         per1.fun();
//     }
// }

//static定义方法
// class Person{
//     private String name;
//     private int age;
//     public static void fun(){
//         System.out.println("诗尧喜欢刘苗");
//     }
// }
// public class Day5{
//     public static void main(String[] args){
//         Person.fun();
//         Person per1 = new Person();
//         per1.fun();
//     }
// }


// class Person{
//     private String name;
//     private int age;
//     public static String country;
//     //定义了一个static方法
//     public static void country(String c){
//         country = c;
//     }
//     public Person(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
//     public void fun(){
//         System.out.println(name +"今年"+ age +"岁在"+country);
//     }
// }
// public class Day5{
//     public static void main(String[] args){
//         Person.country("China");  //直接使用Person类改变country属性
//         Person per1 = new Person("诗尧",20);  
//         per1.fun();
//     }
// }


// public class Day5{
//     public static void main(String[] args ){
//     {
//         //代码块
//         int x = 0;
//         System.out.println(x);
//     }
//     int x = 1;
//     System.out.println(x);
//     }
// }

//构造块
// class Person{
//     //不带任何修饰符，构造块
//     {
//         System.out.println("1.Person类的构造块");
//     }
//     //构造方法
//     public Person(){
//         System.out.println("2.Person类的构造方法");
//     }
// }
// public class Day5{
//     public static void main(String[] args ){
//         new Person();
//         new Person();
//     }
// }

//静态代码块
//定义在非主类中
// class Person{
//     //不带任何修饰符，构造块
//     {
//         System.out.println("1.Person类的构造块");
//     }
//     //构造方法
//     public Person(){
//         System.out.println("2.Person类的构造方法");
//     }
//     //静态方法
//     static{
//         System.out.println("3.Person类的静态代码块");
//     }
// }

//定义在主类中的静态代码块
// public class Day5{
//     //构造代码块
//     {
//         System.out.println("3.main类中的构造块");
//     }
//     //主类中的构造方法
//     public Day5(){
//         System.out.println("3.main类中的构造方法");
//     }
//     //主类中的静态构造块
//     static{
//         System.out.println("2.main类中的静态代码块");
//     }
//     public static void main(String[] args ){
//         // new Person();
//         // new Person();
//         System.out.println("start----------");
//         new Day5();
//         new Day5();
//         System.out.println("end----------");
//     }
// }

//父类
// class Person{
//     private String name;
//     private int age;
//     public void setName(String name){
//         this.name = name;
//     }
//     public void setAge(int age){
//         this.age = age;
//     }
//     public String getName(){
//         return name;
//     }
//     public int getAge(){
//         return age;
//     }
// }
// //子类
// class Student extends Person{
//     private String school;
//     public void setSchool(String school){
//         this.school = school;
//     }
//     public String getSchool(){
//         return school;
//     }
//     public String getMessage(){
//         return (getName() +"现在"+ getAge() +"岁在"+ getSchool() +"上学");
//     }
    
// }

// public class Day5{
//     public static void main(String[] ages){
//         Student stu = new Student();
//         stu.setName("刘苗");
//         stu.setAge(20);
//         stu.setSchool("西科大");
//         // System.out.println(stu.getName());
//         // System.out.println(stu.getAge());
//         // System.out.println(stu.getSchool());
//         System.out.println(stu.getMessage());
//     }
// }

