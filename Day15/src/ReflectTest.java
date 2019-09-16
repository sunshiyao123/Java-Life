import javax.lang.model.type.DeclaredType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

//public class ReflectTest {
//    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
////        Date date = new Date();
////        //使用getClass()方法得到Class对象
////        System.out.println(date.getClass());
////        //使用.class取得Class对象
////        System.out.println(Date.class);
////
////        //通过forName()方法
////        Class<?> data = Class.forName("java.util.Date");
////        System.out.println(data.getName());
//
//
//        //使用反射实例化对象
////        Class<?> cls = Class.forName("java.util.Date");
////        Object obj = cls.newInstance();
////        System.out.println(obj);
//
//        //当使用反射实例化对象时，没有无参构造或者无参构造权限不够
////        Class<?> cls = Class.forName("Person");
////        Object obj = cls.newInstance();
////        System.out.println(obj);
//
//        //反射与类的操作
//
//
//    }
//}

//class Person{
//    private String name;
//    private int age;
//
//    private Person() {
//    }
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}

//public class ReflectTest {
//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException,
//            InvocationTargetException, InstantiationException {
//        Class<?> cls = Person.class;
//        //取得类中指定参数的构造方法(只可以是public权限)
//        Constructor<?> constructor = cls.getConstructor(String.class, int.class);
//        System.out.println(constructor);
//
//        //取得类中所有的构造方法(只可以是public权限)
//        Constructor<?>[] constructors = cls.getConstructors();
//        for (Constructor<?> constructors1 : constructors) {
//            System.out.println(constructors1);
//        }
//
//        //取得类中指定参数的构造方法（不管权限）
//        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(String.class, int.class);
//        System.out.println(declaredConstructor);
//
//        //取得类中所有构造方法（不管权限）
//        Constructor<?>[] constructors2s = cls.getDeclaredConstructors();
//        for (Constructor<?> declaredConstructors : constructors2s) {
//            System.out.println(declaredConstructors);
//        }
//
//        //通过Constructor类实例化一个新的对象
//        Constructor<?> cons = cls.getConstructor(String.class,int.class);
//        System.out.println(cons.newInstance("刘苗",18));

//        Class<?> cls = ChildImpl.class;
//        //取得父类名称
//        System.out.println(cls.getSuperclass().getName());
//        //取得实现的父接口对象
//        Class<?>[] iClass = cls.getInterfaces();
//        for (Class<?>class1 : iClass) {
//            System.out.println(class1);
//        }
//        Class<?> cls1 = B.class;
//        System.out.println(cls1.getSuperclass().getName());


//    }
//}


//interface IFather{}
//interface IMother{}
//class A{}
//class ChildImpl implements IFather,IMother {}
//class B extends A{}

//
//class Person{
//    private String name;
//    private int age;
//
//    public Person() {
//    }
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}


//public class ReflectTest {
//    public static void main(String[] args) throws IllegalAccessException, InstantiationException,
//            NoSuchMethodException, InvocationTargetException, ClassNotFoundException {
////        Class<?> cls = Person.class;
////        Method[] methods = cls.getMethods();
////        for (Method method : methods){
////            System.out.println(method);
////        }
//
//        //先找到Person类
//        Class<?> cls = Class.forName("Person");
//        //根据newInstance()方法实例化对象
//        Object obj = cls.newInstance();
//        //取得setName这个方法的实例化对象，设置方法名称与参数类型
//        Method setMethod = cls.getMethod("setName",String.class);
//        //通过Method类对象调用指定的方法，调用方法需要有实例化对象
//        setMethod.invoke(obj,"刘苗");
//        Method getMethod = cls.getMethod("getName");
//        Object result = getMethod.invoke(obj);
//        System.out.println(result);
//
//    }
//}

//public class ReflectTest {
//    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
//        Class<?> cls = Class.forName("Person");
//        //取得固定名称的属性（只可以取得public权限）
//        Field field = cls.getField("name");
//        System.out.println(field);
//        //取得所有属性（只可以取得public权限）
//        Field[] fields = cls.getFields();
//        for (Field fields1 : fields) {
//            System.out.println(fields1);
//        }
//        //取得固定名称的属性（可以取得所有权限）
//        Field declareField = cls.getDeclaredField("name");
//        System.out.println(declareField);
//        //取得所有属性（可以取得所有权限）
//        Field[] declareFields = cls.getDeclaredFields();
//        for (Field field2 : declareFields){
//            System.out.println(field2);
//        }
//    }
//}


//public class ReflectTest {
//    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
//            InstantiationException, NoSuchFieldException {
//        Class<?> cls = Class.forName("Person");
//        Object obj = cls.newInstance();
//        //获取名字为name的属性
//        Field nameField = cls.getDeclaredField("name");
//        //动态破坏封装
//        nameField.setAccessible(true);
//        //调用set与get方法（必须要有实例化对象）
//        nameField.set(obj,"刘苗");
//        System.out.println(nameField.get(obj));
//        //取得属性类型
//        System.out.println(nameField.getType().getSimpleName());
//    }
//}


