/**
public class FactoryTest {
    public static void main(String[] args) {
        IFruit fruit = FruitFactory.
                getInstance("orange");
        fruit.eat();
    }
}
interface IFruit {
    public void eat();
}
class Orange implements IFruit{
    @Override
    public void eat() {
        System.out.println("吃橘子");
    }
}
class Apple implements IFruit {
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}
class FruitFactory {
    private FruitFactory() {}
    public static IFruit getInstance(String className) {
        if ("apple".equals(className)){
            return new Apple();
        } else if ("orange".equals(className)){
                return new Orange();
        }
        return null;
    }
}
 */




//public class FactoryTest {
//    public static void main(String[] args) throws IllegalAccessException,
//            InstantiationException, ClassNotFoundException {
//        IFruit fruit = FruitFactory.getInstance("orange");
//        fruit.eat();
//    }
//}
//interface IFruit {
//    public void eat();
//}
//class Orange implements IFruit{
//    @Override
//    public void eat() {
//        System.out.println("吃橘子");
//    }
//}
//class Apple implements IFruit {
//    @Override
//    public void eat() {
//        System.out.println("吃苹果");
//    }
//}
//
///**
// * 使用反射来实例化对象
// */
//class FruitFactory {
//    private FruitFactory() {}
//    public static IFruit getInstance(String className) throws ClassNotFoundException,
//            IllegalAccessException, InstantiationException {
//        String realName = className.substring(0,1).toUpperCase()
//                + className.substring(1);
//        Class<?> cls = Class.forName(realName);
//        IFruit fruit = (IFruit) cls.newInstance();
//        return fruit;
//    }
//}