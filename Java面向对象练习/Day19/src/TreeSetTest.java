//import java.util.Set;
//import java.util.TreeSet;
//
//public class TreeSetTest {
//    public static void main(String[] args) {
//        Set<Person> set = new TreeSet<>();
//        set.add(new Person("诗尧",20));
//        set.add(new Person("刘苗",18));
//        set.add(new Person("诗尧",20));
//        System.out.println(set);



//        //TreeSet使用的是升序排列的模式
//        Set<String> set = new TreeSet<>();
//        set.add("a");
//        set.add("b");
//        set.add("d");
//        set.add("c");
//        set.add(null);
//        System.out.println(set);
//    }
//}

//class Person implements Comparable<Person>{
//    private String name;
//    private int age;
//    public int compareTo(Person per) {
//        if (this.age > per.age) {
//            return 1;
//        }
//        else if (this.age < per.age) {
//            return -1;
//        }
//        else {
//            return this.name.compareTo(per.name);
//        }
//    }
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
//        this.name = name;
//        this.age = age;
//    }
//
//}
