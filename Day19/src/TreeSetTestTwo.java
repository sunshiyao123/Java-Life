import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTestTwo {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();
        set.add(new Person("诗尧",20));
        set.add(new Person("诗尧",20));
        set.add(new Person("刘苗",20));
        System.out.println(set);
    }
}
class Person implements Comparable<Person> {

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

//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Objects.equals(age, person.age)
//                && Objects.equals(name, person.name);
//    }
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
    public int compareTo(Person o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return this.name.compareTo(o.name);
        }
    }
}

