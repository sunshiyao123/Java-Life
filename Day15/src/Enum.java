import com.sun.org.apache.bcel.internal.generic.RET;

import java.awt.*;

public class Enum {
    public static void main(String[] args) {
//        switch (Sex.MAN) {
//            case MAN:
//                System.out.println("男生");
//                break;
//            case WOMAN:
//                System.out.println("女生");
//                break;
//                default:
//                    System.out.println("输入错误");
//                    break;
//        }

//        Person per = new Person("刘苗",18,Sex.WOMAN);
//        Person per1 = new Person("诗尧",18,Sex.MAN);
//        System.out.println(per.toString());
//        System.out.println(per1.toString());

//        ColorImpl color = ColorImpl.BLUE;
//        System.out.println(color.toString());


//        System.out.println(Color.BLUE);
//        //Color.values() 为取得所有枚举数据
//        for (Color temp: Color.values()) {
//            System.out.println(temp);
//        }
    }
}
//enum Color {
//    //如果定义有很多内容，枚举对象必须写在第一行
//    RED("红色"),BLUE("蓝色"),YELLOW("黄色");
//    private String title;
//    //构造方法私有化
//    private Color(String title) {
//        this.title = title;
//    }
//
//    @Override
//    public String toString() {
//        return this.title;
//    }
//}


/**
 * 多例设计模式
 */
//class Color {
//    private String title;
//
//    public Color(String title) {
//        this.title = title;
//    }
//
//    public static final int RED = 1;
//    public static final int BLUE = 2;
//    public static final int YELLOW = 3;
//    private static final Color Red = new Color("Red");
//    private static final Color Blue = new Color("Blue");
//    private static final Color Yellow = new Color("Yellow");
//    public static Color getInstance(int ch) {
//        switch(ch) {
//            case RED:
//                return Red;
//            case BLUE:
//                return Blue;
//            case YELLOW:
//                return Yellow;
//                default:
//                    return null;
//        }
//    }
//}

//interface IColor {
//    public String getColor();
//}
//
//enum ColorImpl implements IColor{
//    RED("红色"),BLUE("蓝色"),YELLOW("黄色");
//
//    private String title;
//    //构造方法私有化
//    private ColorImpl(String title) {
//        this.title = title;
//    }
//    @Override
//    public String getColor() {
//        return this.title;
//    }
//    public String toString() {
//        return this.title;
//    }
//}

//enum Sex {
//    MAN("男生"),WOMAN("女生");
//    private String title;
//    Sex(String title) {
//        this.title = title;
//    }
//
//    @Override
//    public String toString() {
//        return title;
//    }
//}
//class Person {
//    private String name;
//    private int age;
//    private Sex sex;
//
//    public Person(String name, int age, Sex sex) {
//        super();
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }
//
//    @Override
//    public String toString() {
//        return name+"永远"+age+"岁，是一个很可爱的"+sex;
//    }
//}