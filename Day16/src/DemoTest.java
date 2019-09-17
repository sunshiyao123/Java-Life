import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DemoTest {
    private static final Object RealSubject = new RealSubject();

    public static void main(String[] args) {
        ISubject subject = Factory.getInstance("ProxySubject",RealSubject);
        subject.eat();

    }
}

/**
 * 接口
 */
 interface ISubject {
    public void eat();
 }

/**
 * 真实类
 */
class RealSubject implements ISubject {

     @Override
     public void eat() {
         System.out.println("饿了要吃饭");
     }
 }

/**
 * 代理类
 */
class ProxySubject implements ISubject{
    private ISubject subject;
    public ProxySubject(ISubject subject){
        this.subject = subject;
    }
    public void prepare() {
        System.out.println("饭前收拾食材");
    }
    public void afterEat() {
        System.out.println("洗碗！");
    }

     @Override
     public void eat() {
         this.prepare();
         this.subject.eat();
         this.afterEat();
     }
 }
 class Factory {
    private Factory(){}
    public static <T> T getInstance(String className) {
        T t = null;
        try {
            t = (T) Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return t;
    }
    public static <T> T getInstance(String className, Object obj){
        T t = null;
        try {
            Constructor<?> cons = Class.forName(className).getConstructor(obj.getClass().getInterfaces()[0]);
            t =(T) cons.newInstance(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return t;
    }


 }