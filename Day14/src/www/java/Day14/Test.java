package www.java.Day14;
//此时MyMath类中方法为静态方法
//import static www.java.Ssy.MyMath.*;
public class Test {
    public static void main(String[] args) {
        Point<String> data = new Point<>();
        data.testMethod1("喜欢刘苗");
        Integer i = data.testMethod2(520);
        System.out.println(i);


        //在定义的时候可以这样写则在使用时确定类型
//        PointTwo p = new PointTwo<>();
//        p.setX(123);
//        System.out.println(p.getX());


//        PointTwo <String> p = new PointTwo<>();
//        p.setX("诗尧");
//        p.setY("刘苗");
//        //避免了向下转型
//        String x = p.getX();
//        String y = p.getY();
//        System.out.println(x + "喜欢" + y);



//        Point p = new Point();
//        p.setX(20.5);
//        String x = (String) p.getX();
        //传入的是一个Double类型，但强制类型转换时转换为String
        //类型此时会出现ClassCastException

//        p.setX(10);
//        p.setY(20);
//        int x = (Integer) p.getX();
//        int y = (Integer) p.getY();
//        System.out.println(x);
//        System.out.println(y);



//        System.out.println(add(1,2));
//        System.out.println(sub(1,3));

//        System.out.println(add("a",2,3));
//        int[] data = new int[]{1,2,3};
//        for (int o : data) {
//            System.out.println(o);
//        }
    }
    //方法的可变参数


//    public static int add(String a, int ... array) {
//        System.out.println(a);
//        int n = array.length;
//        int temp = 0;
//        for (int i = 0; i < n; i++) {
//            temp += array[i];
//        }
//        return temp;
//    }
}

//坐标类
//class Point {
//    private Object x;
//    private Object y;
//
//    public Object getX() {
//        return x;
//    }
//    public void setX(Object x) {
//        this.x = x;
//    }
//    public Object getY() {
//        return y;
//    }
//    public void setY(Object y) {
//        this.y = y;
//    }
//}

//泛型类
//class PointTwo<T> {
//    private T x;
//    private T y;
//    public T getX() {
//        return x;
//    }
//    public void setX(T x) {
//        this.x = x;
//    }
//    public T getY() {
//        return y;
//    }
//    public void setY(T y) {
//        this.y = y;
//    }
//}

//泛型类与泛型方法
class Point<T> {
    public void testMethod1(T t) {
        System.out.println(t);
    }
    //定义一个泛型方法
    public <E> E testMethod2(E e){
        return e;
    }
}