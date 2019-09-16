import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.time.Period;

public class TestFour {
    public static void main(String[] args) {
        //使用函数式编程，当有多行代码时必须写上return
//        IMath msg = (p1, p2) -> {
//            int a = p1 + p2;
//            return a;
//        };
//        System.out.println(msg.add(10,20));


        //引用静态方法String类的valueOf()方法
//        IUtil<Integer, String>iu = String :: valueOf;
//        String str = iu.switchPara(1000);
//        System.out.println(str.length());

        //引用对象普通方法
//        IUtil<String> iu = "hello"::toUpperCase;
//        System.out.println(iu.switchPara());

        //引用类中普通方法
//        IUtil<String , Integer>iu = String :: compareTo;
//        System.out.println(iu.switchPara("刘", "孙"));

        //引用类的构造方法
//        IUtil<Person, String , Integer>iu = Person :: new;
//        System.out.println(iu.creatPerson("刘苗",18));
    }
}

//class Person {
//    private String name;
//    private int age;
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}


