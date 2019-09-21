import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        set.add(new Person("诗尧",20));
        set.add(new Person("诗尧",20));
        set.add(new Person("刘苗",20));
        System.out.println(set);
    }
}
class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    //覆写equals保证相同元素的对象不会重复
    @Override
    public boolean equals(Object obj) {
        //自反性
        if (obj == this) {
            return true;
        }
        //非空性
        else if (obj == null) {
            return false;
        }
        else if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person)obj;
        return Objects.equals(this.age, person.age)
                && Objects.equals(this.name, person.name);
    }
    //覆写hashCode方法保证相同元素的对象可以放入一个桶内
    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}