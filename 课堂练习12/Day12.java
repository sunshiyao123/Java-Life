package child;
// public class Day12 {
//     public static void main(String[] args) {
//         Ssy s = new Ssy();
//         s.print();
//         System.out.println("Love LiuMiao");
//         Lm l = new Lm();
//         l.print();
//     }
// }



// public class Day12{
//     public static void main(String[] args) {
//         Ssy s = new Ssy();
//         System.out.println(s.name);
//     }
//  }

public class Day12 {
    public static void main(String[] args) {
        System.out.println("1.数学计算开始前");
        try {
            System.out.println("2.进行数学运算："+10/0);
        }catch(ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("3.数学计算结束后");
    }
}