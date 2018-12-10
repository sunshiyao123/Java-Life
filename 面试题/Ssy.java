//2.阿里校招题
// //父类
// class Person{
//     static{
//         System.out.println("1.父类静态块");
//     }
//     {
//         System.out.println("2.父类构造块");
//     }
//     public Person(){
//         System.out.println("3.父类构造方法");
//     }
// }
// //子类
// class Student extends Person{
//     static{
//         System.out.println("4.子类静态块");
//     }
//     {
//         System.out.println("5.子类构造块");
//     }
//     public Student(){
//         System.out.println("6.子类构造方法");
//     }
//     //主方法
//     public static void main(String[] args){
//     System.out.println("7.主类开始");
//     new Student();    
//     new Student();   
//     System.out.println("8.主类结束");
//     }
// }


//4.数据类型转换
// public class Ssy {
//     public static void main(String[] args) {
//         byte b1=1, b2=2, b3, b6, b8;
//         final byte b4=4, b5=6, b7=9;
//             b3 = (b1 + b2);  //b1+b2两个都自动转换为int型，此时b3为byte型需要强转才可以赋值
//             //b3 = (byte)(b1 + b2);

//             b6 = (b4 + b5);  //b4+b5都被final修饰则不会转换为int型，则结果仍为byte型。

//             b8 = (b1 + b4);  //b1计算提升为int型，b4不转换，则结果为int型，需要强转
//             //b8 = (byte)(b1 + b4);

//             b7 = (b2 + b5);  //和第三个问题一样，并且b7为最终变量，不可以赋值
//             //b7 = (byte)(b2 + b5);
//     }
// }

//题目
// public class Ssy {
//     public static void main(String[] args) {
//         byte b1=1, b2=2, b3, b6, b8;
//         final byte b4=4, b5=6, b7=9;
//             b3 = (b1 + b2);
//             b6 = (b4 + b5);
//             b8 = (b1 + b4);
//             b7 = (b2 + b5);
//     }
// }

