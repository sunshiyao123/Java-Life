import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//public class ListTestTwo {
//    public static void main(String[] args) {
//        List<Person> personList = new ArrayList<>();
//        personList.add(new Person("诗尧", 20));
//        personList.add(new Person("刘苗", 20));
//        //判断是否有此对象
//        personList.remove(new Person("诗尧",20));
//        System.out.println(personList.contains(new Person("诗尧",20)));
//    }
//}
//class Person {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
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
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//    //覆写equals方法
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//        Person person = (Person)o;
//        return Objects.equals(age, person.age) &&
//                Objects.equals(name, person.name);
//    }
//}
