//import javax.xml.soap.Node;
//import java.util.Comparator;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class ComparatorTest {
//    public static void main(String[] args) {
//        //传入一个升序比较器
//        Set<Person> set = new TreeSet<>(new AscAgeComparator());
//        set.add(new Person("诗尧",20));
//        set.add(new Person("刘苗",18));
//        System.out.println(set);
//    }
//}
//class Person {
//    private String name;
//    private int age;
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
//
//    public Person(String name, int age) {
//
//        this.name = name;
//        this.age = age;
//    }
//}
//
///**
// * Person类的比较器
// * 只继承了comparator类中的compare方法，equals方法Object实现
// * 升序比较器
// */
//class AscAgeComparator implements Comparator<Person> {
//    @Override
//    public int compare(Person o1, Person o2) {
//        return o1.getAge()-o2.getAge();
//    }
//}
////降序比较器
//class DescAgeComparator implements Comparator<Person>{
//    @Override
//    public int compare(Person o1, Person o2) {
//        return o2.getAge()-o1.getAge();
//    }
//}
