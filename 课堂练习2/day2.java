
//逻辑控制与方法定义
// public class day2{
//     public static void main(String[] args){
//         int line = 10;
//         for(int x = 0; x < line; x++){
//             for(int y = 0; y < line - x; y++){
//                 System.out.print(" ");
//             }
//             for(int z = 0; z < x;z++){
//                 System.out.print("* ");
//             }
//           System.out.print("\n");
//         }    
//     }
// }

//switch语句
// import java.io.*;
// public class day2{
//     public static void main(String[] args)throws IOException{
//         System.out.println("请输入字符：");
//         char x = (char)System.in.read();
//         switch(x){
//             case 'a':{
//                 System.out.println("喜欢刘苗");
//                 break;
//             }
//             case 'b':{
//                 System.out.println("喜欢诗尧");
//                 break;
//             }
//             default:{
//                 System.out.println("诗尧喜欢刘苗");
//                 break;
//             }
//         }
//     }
// }

//do while
// public class day2{
//     public static void main(String[] args){
//         int x = 10;
//         do{
//             System.out.println("喜欢刘苗");
//             x++;
//         }while(x < 10);
//     }
// }

//for循环
// public class day2{
//     public static void main(String[] args){
//         for(int i = 1; i <= 9; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(i+"*"+j+"="+i*j+" ");
//             }
//             System.out.println("\t");
//         }
//     }
// }

//方法
// public class day2{
//     public static void main(String[] args){
//         System.out.println(add(5,5));
//     }
//     public static int add(int a, int b){
//         return a+b;
//     }
// }

//void 方法
// public class day2{
//     public static void main(String[] args){
//         myPrint(1);
//         myPrint(2);
//         myPrint(3);
//         myPrint(4);
//     }
//     public static void myPrint(int a){
//         if(a == 2){
//             return;
//         }
//         else{
//             System.out.println(a);
//         }
//     }
// }

//方法重载
// public class day2{
//     public static void main(String[] args){
//         System.out.println(add(5,3));
//         System.out.println(add(5,3,5));//方法的名字一样，但参数的个数不一样。
//     }
//     public static int add(int x, int y){     
//         return x+y;
//     }
//     public static int add(int x, int y, int z){
//         return x+y+z;
//     }
// }

//方法递归
// public class day2{
//     public static void main(String[] args){
//         System.out.println(add(100));
//     }
//     public static int add(int x){
//         if(x == 1){
//             return 1;
//         }
//         else{
//             return x + add(x-1);
//         }
//     }
// }

//递归实现阶乘
// public class day2{
//     public static void main(String[] args){
//         System.out.println(factorial(6));
//     }
//     public static int factorial(int x){
//         if(x == 1){
//             return 1;
//         }
//         else{
//             return x * factorial(x-1);
//         }
//     } 
// }