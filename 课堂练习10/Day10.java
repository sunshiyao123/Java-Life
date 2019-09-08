
// //String类
// public class Day10 {
//     public static void main(String[] args){
//         String str1 = "刘苗";  //直接赋值
//         System.out.println(str1);
//         String str2 = new String("刘苗");  //传统方法（构造法）
//         System.out.println(str2);
//     }
// }

// //字符串相等比较
// public class Day10 {
//     public static void main(String[] args) {
//         String str1 = "刘苗";
//         String str2 = new String("刘苗");
//         System.out.println(str1.equals(str2));
//         //结果为true

//         //System.out.println(str1 == str2);
//         //结果是false
//     }
// }

//String中的匿名对象
// public class Day10 {
//     public static void main(String[] args) {
//         String str1 = "诗尧";
//         String str2 = new String("诗尧");
//         System.out.println(str2.equals(str1));
//         //结果为true
//         System.out.println(str1.equals(str2));
//         //结果为true
//     }
// }

// public class Day10 {
//     public static void main(String[] args) {
//         // String str1 = null;
//         // String str2 = new String("诗尧");
//         // System.out.println(str2.equals(str1));
//         // //结果为false
//         // System.out.println(str1.equals(str2));
//         // //出现报错
//         String str = "诗尧";
//         System.out.println("诗尧".equals(str));
//         //结果为true
//     }
// }

//两种实例化的区别
// public class Day10 {
//     public static void main(String[] args) {
//         // String str1 = "诗尧";
//         // String str2 = "诗尧";
//         // String str3 = "诗尧";
//         // System.out.println(str1 == str2);
//         // System.out.println(str1 == str3);
//         // System.out.println(str3 == str2);
//         //结果最后都为true

//         // String str = new String("刘苗");

//         //该字符串常量并没有保存在对象池中
//         // String str1 = new String("刘苗");
//         // String str2 = "刘苗";
//         // System.out.println(str1 == str2);
//         //结果为false

//         // String str1 = new String("刘苗").intern();
//         // String str2 = "刘苗";
//         // System.out.println(str1 == str2);
//         //结果为true
//     }
// }


// public class Day10 {
//     public static void main(String[] args) {
//         // String str = "诗尧";
//         // str = str + "喜欢";     
//         // str = str + "刘苗";
//         // System.out.println(str);  
//         // //结果为：诗尧喜欢刘苗   

//         //会产生大量垃圾空间
//         String str = "Hello";
//         for(int i = 0; i < 1000; i++) {
//             str += " ";
//         }
//     }
// }

//字符与字符串转换
// public class Day10 {
//     public static void main(String[] args) {
//         // String str = "Hello";
//         // System.out.println(str.charAt(0));
//         // //结果为H
//         // System.out.println(str.charAt(10));
//         // //超过字符串长度产生StringIndexOutOfBoundException异常

//         String str = "Hello World";
//         char[] array = str.toCharArray();
//         for(int i = 0; i < 11; i++) {
//             System.out.println(array[i]);
//         }
//         System.out.println(new String(array));
//         //输出结果为Hello World
//         System.out.println(new String(array,6,5));
//         //输出结果为World
//     }
// }

//判断一个数组是否全部为数字组成
// public class Day10 {
//     public static void main(String[] args) {
//         String str = "a5289012";
//         System.out.println(isNumber(str));
//     }
//     public static boolean isNumber(String str) {
//         char[] array = str.toCharArray();
//         for(int i = 0; i < array.length; i++) {
//             if(array[i] <'0' || array[i] > '9') {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

//字节与字符串
// public class Day10 {
//     public static void main(String[] args) {
//         String str = "hello bit";
//         //创建一个字节数组接收
//         byte array[] = str.getBytes();
//         for(int i = 0; i < array.length; i++) {
//             System.out.println(array[i]);
//         }
//         //将字节数组转换为字符串
//         String str1 = new String(array);
//         System.out.println(str1);
//     }
// }

//字符串比较
// public class Day10 {
//     public static void main(String[] args) {
//         String str1 = "abcd";
//         String str2 = "ABcd";
//         System.out.println(str1.compareTo(str2));
//         //结果为32

//         // System.out.println(str1.equals(str2));
//         // //false
//         // System.out.println(str1.equalsIgnoreCase(str2));
//         // //true
//     }
// }

//字符串查找
// public class Day10 {
//     public static void main(String[] args) {
//         String str = " hello world";
//         System.out.println(str.contains("world"));   //true
//         //判断是否存在world
//         System.out.println(str.indexOf("world"));   //7
//         //判断并返回
//         System.out.println(str.indexOf("world",3));  //7
//         //从索引为3处开始判断
//         System.out.println(str.lastIndexOf("world"));  //7
//         //从后面开始判断
//         System.out.println(str.startsWith("hello"));  //false
//         //判断是否以hello开头
//         System.out.println(str.startsWith("hello",1));  //true
//         //从1处开始判断是否以hello开头
//         System.out.println(str.endsWith("world"));  //true
//         //判断是否以world结尾

//     }
// }

//字符串替换，拆分，截取
// public class Day10 {
//     public static void main(String[] args) {
//         //截取
//         String data = "诗尧喜欢刘苗";
//         System.out.println(data.substring(0));
//         //从索引为0处开始截取
//         System.out.println(data.substring(0,2));
//         //从索引为0出开始截取到索引为1
//         System.out.println(data.substring(2,6));
//         //从索引为2处开始截取到索引为5

//         //拆分
//         // String data = "孙诗尧：20|刘苗：20";
//         // String[] result1 = data.split("\\|");
//         // //第一次拆分
//         // for(int i = 0; i < result1.length; i++) {
//         //     //第二次拆分
//         //     String[] result2 = result1[i].split("：");
//         //     System.out.println(result2[0]+"今年"+result2[1]+"岁");
//         // }

//         // String IP = "10.114.0.1";
//         // String IPArray[] = IP.split("\\."); //这里使用转义字符\\.
//         // for(String s : IPArray) {
//         //     System.out.println(s);
//         // }


//         // String str = "诗尧 喜欢 刘苗";
//         // String array1[] =str.split(" ");
//         // for(String s : array1) {
//         //     System.out.println(s);
//         // }
//         // String array2[] =str.split(" ",2);
//         // for(String s : array2) {
//         //     System.out.println(s);
//         // }

//         //替换
//         // System.out.println(str.replaceAll(" ","_"));
//         // //把第一个" "换为"_"
//         // System.out.println(str.replaceFirst(" ","_"));   
//         // //把所有的" "换为"_"
//     }
// }

// public class Day10 {
//     public static void main(String[] args) {
//         System.out.println("hello".isEmpty());   //false
//         System.out.println("".isEmpty());   //true
//         System.out.println(new String().isEmpty());   //true


//         // String str = "诗尧喜欢刘苗";
//         // System.out.println(str.length());

//         // String str = "     诗尧喜欢刘苗     ";
//         // System.out.println("*"+str.trim()+"*");

//         // String data = "hello WORLD";
//         // System.out.println(data.toUpperCase());
//         // //全部转换为大写
//         // System.out.println(data.toLowerCase());
//         // //全部转换为小写
//     }
// }

//首字母大写
// public class Day10 {
//     public static void main(String[] args) {
//         System.out.println(firstUpper("hello"));  //Hello
//         System.out.println(firstUpper(" "));  //" "
//         System.out.println(firstUpper("a"));  //"A"
//     }
//     public static String firstUpper(String data) {
//         if(" ".equals(data) || data == null) {
//             return data;
//         }
//         if(data.length()>1){
//             return data.substring(0,1).toUpperCase() + data.substring(1);
//         }else{
//             return data.toUpperCase();
//         }
//     }
// }