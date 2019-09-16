import java.lang.reflect.Member;

class Person{}
public class ClassLoaderTest {
    public static void main(String[] args) {
        Class<?> cls = Person.class;
        System.out.println(cls.getClassLoader());
        System.out.println(cls.getClassLoader().getParent());
        System.out.println(cls.getClassLoader().getParent().getParent());
    }
}
