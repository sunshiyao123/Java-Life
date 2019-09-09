//StringBuffer和StringBuilder类
// public class Day11 {
//     public static void main(String[] args) {
//         StringBuffer str1 = new StringBuffer();
//         str1.append("喜欢").append("刘苗");
//         System.out.println(str1);
//         //输出结果为  喜欢刘苗
//     }
// }

// public class Day11 {
//     public static void main(String[] args) {
//         //String反转
//         // StringBuffer data = new StringBuffer("你是年少的欢喜");
//         // System.out.println(data.reverse());
//         //输出结果为：喜欢的少年是你

//         //String删除
//         // StringBuffer data = new StringBuffer("你是诗尧年少的欢喜");
//         // System.out.println(data.delete(2,4));
//         // 删除下标为2到4（左闭右开）
//         // 输出结果为：你是年少的欢喜

//         //String插入
//         // StringBuffer data = new StringBuffer("你是诗尧年少的欢喜");
//         // System.out.println(data.insert(0,"刘苗，"));
//         //输出结果为：刘苗，你是诗尧年少的欢喜

//         // //String与StringBuffer的转换
//         // String str = "诗尧";
//         // String str2 = "喜欢刘苗";
//         // //构造方法
//         // StringBuffer data = new StringBuffer(str);
//         // // System.out.println(data.append("和刘苗"));
//         // System.out.println(data.append(str2));

//         // //构造方法
//         // String str1 = new String(data);
//         // System.out.println(str1);    
//     }
// }

//Object类
// class Person {}
// public class Day11 {
//     public static void main (String[] args) {
//         fun(new Person());
//     }
//     //设置Object类来接受对象
//     public static void fun(Object obj) {
//         System.out.println(obj);
//     }
// }

//
// class Person {
//     private String name;
//     private int age;
//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
//     public String toString() {
//         return "姓名：" + this.name + ",年龄：" +this.age;
//     }
// }
// public class Day11 {
//     public static void main(String[] args) {
//         fun(new Person("刘苗",20));
//         //传入的是一个Person对象
//         fun("诗尧");
//         //传入的是一个String常量
//     }
//     public static void fun(Object obj) {
//         System.out.println(obj.toString());
//     }
// }


// class Person {
//     private String name = "诗尧";
//     private int age = 20;
//     public Person (String name, int age){
//         this.name = name;
//         this.age = age;
//     }
//     public String toString() {
//         return "姓名为"+this.name+",今年"+this.age+"岁";
//     }
// }
// public class Day11 {
//     public static void main(String[] args) {
//         fun(new Person("刘苗",20));
//         fun("hello");
//     }
//     public static void fun(Object obj) {
//         System.out.println(obj.toString());
//     }
// }

//内容比较
// class Person {
//     private String name = "诗尧";
//     private int age = 20;
//     public Person (String name, int age){
//         this.name = name;
//         this.age = age;
//     }
//     public String toString() {
//         return "姓名为"+this.name+",今年"+this.age+"岁";
//     }
//     public boolean equals(Object obj) {
//         if(this == obj) {
//             return true;
//         }
//         if(!(obj instanceof Person)) {
//             return false;
//         }
//         Person per = (Person) obj;
//         return per.name.equals(this.name) && this.age == per.age;
//     }
// }
// public class Day11 {
//     public static void main(String[] args) {
//         Person per = new Person("诗尧",20);
//         Person per2 = new Person("诗尧",20);
//         System.out.println(per.equals(per2));
//     }
// }

//Object类接受数组
// public class Day11 {
//     public static void main(String[] args) {
//         Object obj = new int[]{1,2,3,4,5};
//         int[] data = (int[])obj;
//         for(int i : data) {
//             System.out.println(i);
//         }
//     }
// }

//Object类接受接口对象
// interface IMessage {
//     public void getMessage();
// }
// class MessageImpl implements IMessage {
//     public String toString() {
//         return "诗尧喜欢刘苗";
//     }
//     public void getMessage() {
//         System.out.println("真的想和你永远在一起");
//     }
// }
// public class Day11 {
//     public static void main(String[] args) {
//         IMessage msg = new MessageImpl(); //子类向父接口转型
//         Object obj = msg; //接口向Object转型
//         System.out.println(obj);
//         IMessage temp = (IMessage)obj;
//         temp.getMessage();
//     }
// }

// class IntDemo {
//     private int num;
//     public IntDemo(int num) {
//         this.num = num;
//     }
//     public int intValue() {
//         return this.num;
//     }
// }
// public class Day11 {
//     public static void main(String[] args) {
//         Object obj = new IntDemo(20);//装箱
//         //子类向上转型
//         IntDemo temp = (IntDemo) obj;
//         //向下强转
//         System.out.println(temp.intValue());
//         //取出里面的基本数据类型操作
//     }
// }

// public class Day11 {
//     public static void main(String[] args) {
//         Integer num1 = 130;
//         Integer num2 = 130;
//         System.out.println(num1 == num2);
//         //结果为false
//         Integer num3 = 10;
//         Integer num4 = 10;
//         System.out.println(num3 == num4);
//         //结果为true

//         // Integer num1 = new Integer(10);
//         // Integer num2 = new Integer(10);
//         // System.out.println(num1 == num2);
//         //false
//         // System.out.println(num1 == new Integer(10));
//         //false
//         // System.out.println(num1.equals(new Integer(10)));
//         //true

//         // Integer num = 20;

//         // Integer num = new Integer(20);  //装箱
//         // int data = num.intValue();      //拆箱
//         // System.out.println(num);
//     }
// }

public class Day11 {
    public static void main(String[] args) {
        //使用valueOf方法
        String str = String.valueOf(100);
        System.out.println(str);
        //使用"+"
        String str1 = "诗尧";
        System.out.println(str1 + 666);

        // String str = "1a23";
        // boolean a = Boolean.parseBoolean(str);
        // System.out.println(a);

        //将字符串变为int型
        // String str = "1a23";
        // int data = Integer.parseInt(str);
        // System.out.println(data);
    }
}
